package com.yuer.tencent.htfix;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * 类功能描述：</br>
 *
 * @author 于亚豪
 * @version 1.0 </p> 修改时间：2018/10/25</br> 修改备注：</br>
 */
public class MyHotFixApplication extends TinkerApplication {
    public MyHotFixApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, "com.yuer.tencent.htfix.SampleApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}