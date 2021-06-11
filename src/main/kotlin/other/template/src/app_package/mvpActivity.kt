package other.template.src.app_package

fun mvpAcitivityKt(
    pageName:String,
    packageName:String
)="""
package ${packageName}.activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.alibaba.android.arouter.facade.annotation.Route
import com.lanjiyin.lib_model.base.activity.BaseFragmentActivity
import ${packageName}.fragment.${pageName}Fragment


@Route(path = ARouterXXX.${pageName}Activity)
class ${pageName}Activity : BaseFragmentActivity() {
    var fragment: ${pageName}Fragment = ${pageName}Fragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setDefaultTitle("")
    }

    override fun initFragment(): Fragment {
        return fragment
    }

}
"""