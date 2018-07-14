package org.videolan.vlc.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010\u001a\u0012\u0010\u0011\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010\u001aA\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\t2\'\u0010\u0015\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0016\u00a2\u0006\u0002\b\u001a\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\b\u001a\u00020\t8\u00c2\u0002X\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\t\u00a8\u0006\u001c"}, d2 = {"THREAD_FACTORY", "Ljava/util/concurrent/ThreadFactory;", "VLCIO", "Lkotlinx/coroutines/experimental/CloseableCoroutineDispatcher;", "getVLCIO", "()Lkotlinx/coroutines/experimental/CloseableCoroutineDispatcher;", "mainThread", "Ljava/lang/Thread;", "uiDispatch", "", "getUiDispatch", "()Z", "runBackground", "", "runnable", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/experimental/Runnable;", "runOnMainThread", "uiJob", "Lkotlinx/coroutines/experimental/Job;", "dispatch", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/experimental/CoroutineScope;", "Lkotlin/coroutines/experimental/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(ZLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/experimental/Job;", "vlc-android_vanillaARMv7Debug"})
public final class WorkersKt {
    private static final java.util.concurrent.ThreadFactory THREAD_FACTORY = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.coroutines.experimental.CloseableCoroutineDispatcher VLCIO = null;
    private static final java.lang.Thread mainThread = null;
    
    @org.jetbrains.annotations.NotNull()
    public static final kotlinx.coroutines.experimental.CloseableCoroutineDispatcher getVLCIO() {
        return null;
    }
    
    private static final boolean getUiDispatch() {
        return false;
    }
    
    public static final void runBackground(@org.jetbrains.annotations.NotNull()
    java.lang.Runnable runnable) {
    }
    
    public static final void runOnMainThread(@org.jetbrains.annotations.NotNull()
    java.lang.Runnable runnable) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final kotlinx.coroutines.experimental.Job uiJob(boolean dispatch, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super kotlinx.coroutines.experimental.CoroutineScope, ? super kotlin.coroutines.experimental.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
        return null;
    }
}