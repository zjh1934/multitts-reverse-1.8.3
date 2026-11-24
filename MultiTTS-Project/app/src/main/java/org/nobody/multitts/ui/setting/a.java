package org.nobody.multitts.ui.setting;

import java.io.Serializable;
import org.nobody.multitts.AppContext;

/* 补回 2026-11-24：jadx 改名 / Windows 大小写折叠导致 SettingActivity.java:106
   引用的 org.nobody.multitts.ui.setting.a 在源码树中缺失，CI 编译报
   "cannot find symbol class a"。参照同目录 b/t/z 等监听器重建，
   负责 config_decode_stream 开关的持久化。 */
public final class a implements w1.l {

    public final /* synthetic */ z6.a a;

    public a(z6.a aVar) {
        this.a = aVar;
    }

    @Override // w1.l
    public final boolean b(Serializable serializable) {
        boolean zBooleanValue = ((Boolean) serializable).booleanValue();
        AppContext.putBoolean("config_decode_stream", zBooleanValue);
        return true;
    }
}
