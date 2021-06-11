package other.template

import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.android.tools.idea.wizard.template.RecipeExecutor
import other.template.res.layout.mvpFragmentXml
import other.template.src.app_package.*

fun RecipeExecutor.mvpActivityRecipe(
    moduleData: ModuleTemplateData,
    pageName: String,
    packageName: String
) {
    val (projectData, srcOut, resOut) = moduleData
    val ktOrJavaExt = projectData.language.extension
//    generateManifest(
//            moduleData = moduleData,
//            activityClass = "${activityClass}Activity",
//            activityTitle = activityClass,
//            packageName = packageName,
//            isLauncher = false,
//            hasNoActionBar = false,
//            generateActivityTitle = true,
//            requireTheme = false,
//            useMaterial2 = false
//    )

    val mvpActivity = mvpAcitivityKt(pageName, packageName)
    val mvpFragment = mvpFragment(pageName, packageName)
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
    // 保存xml
    save(mvpFragmentXml(pageName), resOut.resolve("layout/fragment_${convertName(pageName)}.xml"))
  }