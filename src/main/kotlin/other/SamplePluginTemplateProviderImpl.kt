package other

import com.android.tools.idea.wizard.template.Template
import com.android.tools.idea.wizard.template.WizardTemplateProvider
import other.template.mvpActivityTemplate
import other.template.mvpAppbarTemplate

class SamplePluginTemplateProviderImpl:WizardTemplateProvider() {
    override fun getTemplates(): List<Template> {
        return listOf(
            //普通+列表模板
            mvpActivityTemplate,
            //收缩布局模板
            mvpAppbarTemplate
        )
    }

}