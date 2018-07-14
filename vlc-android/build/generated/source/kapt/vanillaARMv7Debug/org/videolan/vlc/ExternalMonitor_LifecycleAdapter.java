package org.videolan.vlc;

import android.arch.lifecycle.GeneratedAdapter;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MethodCallsLogger;
import java.lang.Override;

public class ExternalMonitor_LifecycleAdapter implements GeneratedAdapter {
  final ExternalMonitor mReceiver;

  ExternalMonitor_LifecycleAdapter(ExternalMonitor receiver) {
    this.mReceiver = receiver;
  }

  @Override
  public void callMethods(LifecycleOwner owner, Lifecycle.Event event, boolean onAny,
      MethodCallsLogger logger) {
    boolean hasLogger = logger != null;
    if (onAny) {
      return;
    }
    if (event == Lifecycle.Event.ON_START) {
      if (!hasLogger || logger.approveCall("register", 1)) {
        mReceiver.register();
      }
      return;
    }
    if (event == Lifecycle.Event.ON_STOP) {
      if (!hasLogger || logger.approveCall("unregister", 1)) {
        mReceiver.unregister();
      }
      return;
    }
  }
}
