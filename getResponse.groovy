def groovyUtils = new com.eviware.soapui.support.GroovyUtils( context )  

// get XmlHolder for response message def 
def holder = groovyUtils.getXmlHolder( "getSupportCityString#Response" ) 

log.info 'fanshaohua+' + holder.getXml()

holder.namespaces["ns"] = "http://WebXml.com.cn/"
log.info 'fanshaohua+' + holder.getNodeValue('//ns:string')
