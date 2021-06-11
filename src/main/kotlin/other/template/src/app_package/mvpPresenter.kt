package other.template.src.app_package

fun mvpPresenter(
    pageName:String,
    packageName:String
)="""
package ${packageName}.presenter

import com.lanjiyin.lib_model.base.presenter.BasePresenter
import ${packageName}.contract.${pageName}Contract


class ${pageName}Presenter : BasePresenter<${pageName}Contract.View>()
    , ${pageName}Contract.Presenter {


    override fun refresh() {
        
    }

}
"""
