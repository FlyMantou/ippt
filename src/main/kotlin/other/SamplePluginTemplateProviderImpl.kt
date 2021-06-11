package other

import com.android.tools.idea.wizard.template.Template
import com.android.tools.idea.wizard.template.WizardTemplateProvider
import other.template.mvpActivityTemplate

class SamplePluginTemplateProviderImpl:WizardTemplateProvider() {
    override fun getTemplates(): List<Template> {
        return listOf(
            //activity模板
            mvpActivityTemplate
            //fragment模板
//            mvpFragmentTemplate
        )
    }

}