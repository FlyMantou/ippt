package other.template.src.app_package

fun mvpAdapter(
    pageName:String,
    packageName:String
)="""
package ${packageName}.adapter

import com.lanjiyin.library.adapter.base.BaseQuickAdapter
import com.lanjiyin.library.adapter.base.viewholder.BaseViewHolder
import ${packageName}.R

class ${pageName}Adapter : BaseQuickAdapter<String, BaseViewHolder>(R.layout.item_${convertName(pageName)}) {

    override fun convert(helper: BaseViewHolder, item: String?) {
       
    }
}
"""
