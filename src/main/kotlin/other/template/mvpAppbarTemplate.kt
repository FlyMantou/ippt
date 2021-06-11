package other.template

import com.android.tools.idea.wizard.template.*
import com.android.tools.idea.wizard.template.impl.activities.common.MIN_API

val mvpAppbarTemplate
    get() = template {
        revision = 1
        name = "蓝基因MVP生成器-收缩布局"
        description = "适用于蓝基因合并版项目快速生成MVP页面，包含Activity，Fragment，Contract，Presenter，xml文件，注意：Manifest配置需要自行添加"
        minApi = MIN_API
        minBuildApi = MIN_API
        category = Category.Other
        formFactor = FormFactor.Mobile
        screens = listOf(WizardUiContext.ActivityGallery, WizardUiContext.MenuEntry, WizardUiContext.NewProject, WizardUiContext.NewModule)


        val activityClass = stringParameter {
            name = "Page Name"
            default = "Empty"
            help = "输入页面名称"
            constraints = listOf(Constraint.NONEMPTY)
        }
//
//        layoutName = stringParameter {
//            name = "fragment layout Name"
//            default = "fragment_main"
//            help = "请输入布局的名字"
//            constraints = listOf(Constraint.LAYOUT, Constraint.UNIQUE, Constraint.NONEMPTY)
//            suggest = { "${activityToLayout(activityClass.value.toLowerCase())}" }
//        }

        val containRecyclerView = booleanParameter {
            name = "生成CoordinatorLayout+AppBarLayout+CollapsingToolbarLayout+ViewPager"
            default = true
            help = "勾选此项，生成收缩布局"

        }
        val packageName = defaultPackageNameParameter






        widgets(
            TextFieldWidget(activityClass),
            CheckBoxWidget(containRecyclerView),
            PackageNameWidget(packageName),
        )
//        thumb { File("logo.png") }
        recipe = { data: TemplateData ->
            mvpAppbarRecipe(
                data as ModuleTemplateData,
                activityClass.value,
                packageName.value,
                containRecyclerView.value)
        }
    }



