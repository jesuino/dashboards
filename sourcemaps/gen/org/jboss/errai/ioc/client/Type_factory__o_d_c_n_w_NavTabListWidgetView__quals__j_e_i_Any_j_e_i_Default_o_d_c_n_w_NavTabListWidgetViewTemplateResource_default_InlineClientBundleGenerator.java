package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Type_factory__o_d_c_n_w_NavTabListWidgetView__quals__j_e_i_Any_j_e_i_Default_o_d_c_n_w_NavTabListWidgetViewTemplateResource_default_InlineClientBundleGenerator implements org.jboss.errai.ioc.client.Type_factory__o_d_c_n_w_NavTabListWidgetView__quals__j_e_i_Any_j_e_i_Default.o_d_c_n_w_NavTabListWidgetViewTemplateResource {
  private static Type_factory__o_d_c_n_w_NavTabListWidgetView__quals__j_e_i_Any_j_e_i_Default_o_d_c_n_w_NavTabListWidgetViewTemplateResource_default_InlineClientBundleGenerator _instance0 = new Type_factory__o_d_c_n_w_NavTabListWidgetView__quals__j_e_i_Any_j_e_i_Default_o_d_c_n_w_NavTabListWidgetViewTemplateResource_default_InlineClientBundleGenerator();
  private void getContentsInitializer() {
    getContents = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/home/wsiqueir/.m2/repository/org/dashbuilder/dashbuilder-navigation-client/0.0.0/dashbuilder-navigation-client-0.0.0-sources.jar!/org/dashbuilder/client/navigation/widget/NavTabListWidgetView.html
      public String getText() {
        return "<div data-field=\"mainDiv\">\n  <div data-field=\"tabsDiv\">\n    <div>\n      <ul data-field=\"tabList\" class=\"nav nav-tabs\"></ul>\n    </div>\n    <div data-field=\"childrenDiv\"></div>\n  </div>\n</div>\n";
      }
      public String getName() {
        return "getContents";
      }
    }
    ;
  }
  private static class getContentsInitializer {
    static {
      _instance0.getContentsInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return getContents;
    }
  }
  public com.google.gwt.resources.client.TextResource getContents() {
    return getContentsInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.google.gwt.resources.client.TextResource getContents;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      getContents(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("getContents", getContents());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'getContents': return this.@org.jboss.errai.ioc.client.Type_factory__o_d_c_n_w_NavTabListWidgetView__quals__j_e_i_Any_j_e_i_Default.o_d_c_n_w_NavTabListWidgetViewTemplateResource::getContents()();
    }
    return null;
  }-*/;
}
