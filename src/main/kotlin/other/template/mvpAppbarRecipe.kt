package other.template

import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.android.tools.idea.wizard.template.RecipeExecutor
import other.template.res.layout.mvpAdapterXml
import other.template.res.layout.mvpAppbarXml
import other.template.res.layout.mvpFragmentXml
import other.template.src.app_package.*

fun RecipeExecutor.mvpAppbarRecipe(
    moduleData: ModuleTemplateData,
    pageName: String,
    packageName: String,
    isHaveAppbar:Boolean
) {
    val (projectData, srcOut, resOut) = moduleData
    val ktOrJavaExt = projectData.language.extension

    val mvpActivity = mvpAcitivityKt(pageName, packageName)
    val mvpFragment = mvpFragment(pageName, packageName,false)
    val mvpContract = mvpContract(pageName, packageName)
    val mvpPresenter = mvpPresenter(pageName, packageName)

    // 保存Activity
    save(mvpActivity, srcOut.resolve("activity/${pageName}Activity.${ktOrJavaExt}"))
    //Fragment
    save(mvpFragment, srcOut.resolve("fragment/${pageName}Fragment.${ktOrJavaExt}"))
    //Contract
    save(mvpContract, srcOut.resolve("contract/${pageName}Contract.${ktOrJavaExt}"))
    //Presenter
    save(mvpPresenter, srcOut.resolve("presenter/${pageName}Presenter.${ktOrJavaExt}"))
    //Appbar
    if (isHaveAppbar){
        save(mvpAppbarXml(pageName), resOut.resolve("layout/fragment_${convertName(pageName)}.xml"))
    }else{
        save(mvpFragmentXml(pageName,false), resOut.resolve("layout/fragment_${convertName(pageName)}.xml"))
    }

  }