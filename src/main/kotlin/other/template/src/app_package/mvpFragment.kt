package other.template.src.app_package

import java.util.regex.Pattern


fun mvpFragment(
    pageName:String,
    packageName:String
)="""
package ${packageName}.fragment
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_${convertName(pageName)}.*
import com.lanjiyin.lib_model.base.interfaces.IPresenter
import ${packageName}.R
import android.view.View


class ${pageName}Fragment :
    BasePresenterFragment<String, ${pageName}Contract.View, ${pageName}Contract.Presenter>()
    , ${pageName}Contract.View
    , View.OnClickListener {

    var mPresenter = ${pageName}Presenter()
    
    companion object {
        fun getInstance(
            from:Int // 0 章节  1 章节组题
        ): ${pageName}Fragment {
            val f = ${pageName}Fragment()
            val bundle = Bundle()
            bundle.putInt("from", from)
            f.arguments = bundle
            return f
        }
    }
    

    override fun getPresenter(): IPresenter<${pageName}Contract.View> {
        return mPresenter
    }

    override fun initLayoutId(): Int {
        return R.layout.fragment_${convertName(pageName)}
    }


    override fun initView() {
        
    }

    override fun initData() {
        
    }

    override fun onClick(v: View?) {

    }

}
"""


fun convertName(name: String?): String? {
    var result = ""
    if (name != null) {
        if (!Pattern.compile(".*[_]+.*").matcher(name).matches()) { //是否是下划线命名
            if (!Pattern.compile(".*[A-Z]+.*").matcher(name).matches()) { //是否包含大写字母
                return name
            }
            result = name.replace("([a-z])([A-Z])".toRegex(), "$1" + "_" + "$2").toLowerCase()
        } else {
            for (s in name.split("_".toRegex()).toTypedArray()) {
                result = result + s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase()
            }
            result = result.substring(0, 1).toLowerCase() + result.substring(1)
        }
    } else {
        return null
    }
    return result
}