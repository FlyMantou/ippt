package other.template.src.app_package


fun mvpContract(
    pageName:String,
    packageName:String
)="""
package ${packageName}.contract

import com.lanjiyin.lib_model.base.interfaces.IBaseView
import com.lanjiyin.lib_model.base.interfaces.IPresenter


interface ${pageName}Contract {
    interface View : IBaseView {
       
    }

    interface Presenter : IPresenter<View> {

    }
}
"""
