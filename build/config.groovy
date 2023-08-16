
withConfig(configuration) {
    inline(phase: 'CONVERSION') { source, context, classNode ->
        classNode.putNodeMetaData('projectVersion', '4.00')
        classNode.putNodeMetaData('projectName', 'grails-resources')
        classNode.putNodeMetaData('isPlugin', 'true')
    }
}
