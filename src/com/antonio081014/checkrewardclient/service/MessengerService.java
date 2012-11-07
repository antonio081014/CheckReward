/**
 * 
 */
package com.antonio081014.checkrewardclient.service;

import java.util.ArrayList;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/**
 * @author Antonio081014
 * 
 */

/**
 * This class mainly works in the background to read and write information with
 * remote server; Further action might be added in the future;
 * */
public class MessengerService extends Service {

	private static final String TAG = "MessangerService";
	private static final boolean D = true;

	/** For showing and hiding our notification. */
	NotificationManager mNM;
	/** Keeps track of all current registered clients. */
	ArrayList<Messenger> mClients = new ArrayList<Messenger>();
	/** Holds last value set by a client. */

	/**
	 * Command to the service to register a client, receiving callbacks from the
	 * service. The Message's replyTo field must be a Messenger of the client
	 * where callbacks should be sent.
	 */
	static final int MSGER_REGISTER_CLIENT = 1;

	/**
	 * Command to the service to unregister a client, ot stop receiving
	 * callbacks from the service. The Message's replyTo field must be a
	 * Messenger of the client as previously given with MSG_REGISTER_CLIENT.
	 */
	static final int MSGER_UNREGISTER_CLIENT = 2;

	/**
	 * Command to service to set a new value. This can be sent to the service to
	 * supply a new value, and will be sent by the service to any registered
	 * clients with the new value.
	 */
	static final int MSG_SET_VALUE = 3;

	/**
	 * Handler of incoming messages from clients.
	 */
	class IncomingHandler extends Handler {
		@Override
		public void handleMessage(Message msg) {
			switch (msg.what) {
			case MSGER_REGISTER_CLIENT:
				Log.i(TAG, "Messanger Added." + msg.replyTo.toString());
				mClients.add(msg.replyTo);
				break;
			case MSGER_UNREGISTER_CLIENT:
				Log.i(TAG, "Messanger Removed.");
				mClients.remove(msg.replyTo);
				break;
			case MSG_SET_VALUE:
				int mValue = msg.arg1;
				Log.i(TAG, "Messanger Value Being Set." + mValue);
				for (int i = mClients.size() - 1; i >= 0; i--) {
					try {
						mClients.get(i).send(
								Message.obtain(null, MSG_SET_VALUE, 1 + mValue,
										0));
					} catch (RemoteException e) {
						// The client is dead. Remove it from the list;
						// we are going through the list from back to front
						// so this is safe to do inside the loop.
						mClients.remove(i);
					}
				}
				break;
			default:
				super.handleMessage(msg);
			}
		}
	}

	/**
	 * Target we publish for clients to send messages to IncomingHandler.
	 */
	final Messenger mMessenger = new Messenger(new IncomingHandler());

	@Override
	public void onCreate() {
		// mNM = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

		// Display a notification about us starting.
		// showNotification();

	}

	@Override
	public void onDestroy() {
		// Cancel the persistent notification.
		// mNM.cancel(R.string.remote_service_started);

		// Tell the user we stopped.
		// Toast.makeText(this, R.string.remote_service_stopped,
		// Toast.LENGTH_SHORT).show();
	}

	/**
	 * When binding to the service, we return an interface to our messenger for
	 * sending messages to the service.
	 */
	@Override
	public IBinder onBind(Intent intent) {
		return mMessenger.getBinder();
	}

	/**
	 * Show a notification while this service is running.
	 */
	private void showNotification() {
		// In this sample, we'll use the same text for the ticker and the
		// expanded notification
		// CharSequence text = getText(R.string.remote_service_started);

		// Set the icon, scrolling text and timestamp

		// Notification notification = new Notification(
		// R.drawable.ic_action_search, text, System.currentTimeMillis());

		// The PendingIntent to launch our activity if the user selects this
		// notification
		// PendingIntent contentIntent = PendingIntent.getActivity(this, 0,
		// new Intent(this, MainActivity.class), 0);

		// Set the info for the views that show in the notification panel.
		// notification.setLatestEventInfo(this,
		// getText(R.string.remote_service_label), text, contentIntent);

		// Send the notification.
		// We use a string id because it is a unique number. We use it later to
		// cancel.
		// mNM.notify(R.string.remote_service_started, notification);
	}

}
