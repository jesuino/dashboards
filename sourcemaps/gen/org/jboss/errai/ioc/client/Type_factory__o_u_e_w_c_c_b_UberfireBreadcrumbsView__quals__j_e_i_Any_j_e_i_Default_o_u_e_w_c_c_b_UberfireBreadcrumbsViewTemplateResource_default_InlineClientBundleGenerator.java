package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Type_factory__o_u_e_w_c_c_b_UberfireBreadcrumbsView__quals__j_e_i_Any_j_e_i_Default_o_u_e_w_c_c_b_UberfireBreadcrumbsViewTemplateResource_default_InlineClientBundleGenerator implements org.jboss.errai.ioc.client.Type_factory__o_u_e_w_c_c_b_UberfireBreadcrumbsView__quals__j_e_i_Any_j_e_i_Default.o_u_e_w_c_c_b_UberfireBreadcrumbsViewTemplateResource {
  private static Type_factory__o_u_e_w_c_c_b_UberfireBreadcrumbsView__quals__j_e_i_Any_j_e_i_Default_o_u_e_w_c_c_b_UberfireBreadcrumbsViewTemplateResource_default_InlineClientBundleGenerator _instance0 = new Type_factory__o_u_e_w_c_c_b_UberfireBreadcrumbsView__quals__j_e_i_Any_j_e_i_Default_o_u_e_w_c_c_b_UberfireBreadcrumbsViewTemplateResource_default_InlineClientBundleGenerator();
  private void getContentsInitializer() {
    getContents = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/home/wsiqueir/.m2/repository/org/uberfire/uberfire-widgets-commons/0.0.0/uberfire-widgets-commons-0.0.0.jar!/org/uberfire/ext/widgets/common/client/breadcrumbs/UberfireBreadcrumbsView.html
      public String getText() {
        return "<!--\n  ~ Copyright 2016 Red Hat, Inc. and/or its affiliates.\n  ~\n  ~ Licensed under the Apache License, Version 2.0 (the \"License\");\n  ~ you may not use this file except in compliance with the License.\n  ~ You may obtain a copy of the License at\n  ~\n  ~       http://www.apache.org/licenses/LICENSE-2.0\n  ~\n  ~ Unless required by applicable law or agreed to in writing, software\n  ~ distributed under the License is distributed on an \"AS IS\" BASIS,\n  ~ WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n  ~ See the License for the specific language governing permissions and\n  ~ limitations under the License.\n  -->\n<div class=\"breadcrumbs-container\">\n  <div class=\"breadcrumbs\">\n    <ol id=\"breadcrumbs\" class=\"breadcrumb uf-breadcrumb\"></ol>\n  </div>\n  <div class=\"breadcrumbs-toolbar\">\n    <div id=\"breadcrumbsToolbar\" class=\"breadcrumbs-toolbar-content\"></div>\n  </div>\n</div>\n";
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
  private void getStyleInitializer() {
    getStyle = new com.google.gwt.resources.client.CssResource() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "getStyle";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".uf-breadcrumb{margin-right:" + ("20px")  + ";}.breadcrumbs-container{display:" + ("-webkit-box")  + ";display:" + ("-webkit-flex")  + ";display:" + ("-ms-flexbox")  + ";display:" + ("flex")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";height:" + ("35px")  + ";width:" + ("100%")  + ";}.breadcrumbs{width:" + ("50%")  + ";}.breadcrumbs-toolbar{width:" + ("50%")  + ";text-align:") + (("left")  + ";padding-top:" + ("8px")  + ";padding-bottom:" + ("8px")  + ";}.breadcrumbs-toolbar-content{margin-left:" + ("20px")  + ";}")) : ((".uf-breadcrumb{margin-left:" + ("20px")  + ";}.breadcrumbs-container{display:" + ("-webkit-box")  + ";display:" + ("-webkit-flex")  + ";display:" + ("-ms-flexbox")  + ";display:" + ("flex")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";height:" + ("35px")  + ";width:" + ("100%")  + ";}.breadcrumbs{width:" + ("50%")  + ";}.breadcrumbs-toolbar{width:" + ("50%")  + ";text-align:") + (("right")  + ";padding-top:" + ("8px")  + ";padding-bottom:" + ("8px")  + ";}.breadcrumbs-toolbar-content{margin-right:" + ("20px")  + ";}"));
      }
    }
    ;
  }
  private static class getStyleInitializer {
    static {
      _instance0.getStyleInitializer();
    }
    static com.google.gwt.resources.client.CssResource get() {
      return getStyle;
    }
  }
  public com.google.gwt.resources.client.CssResource getStyle() {
    return getStyleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.google.gwt.resources.client.TextResource getContents;
  private static com.google.gwt.resources.client.CssResource getStyle;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      getContents(), 
      getStyle(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("getContents", getContents());
        resourceMap.put("getStyle", getStyle());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'getContents': return this.@org.jboss.errai.ioc.client.Type_factory__o_u_e_w_c_c_b_UberfireBreadcrumbsView__quals__j_e_i_Any_j_e_i_Default.o_u_e_w_c_c_b_UberfireBreadcrumbsViewTemplateResource::getContents()();
      case 'getStyle': return this.@org.jboss.errai.ioc.client.Type_factory__o_u_e_w_c_c_b_UberfireBreadcrumbsView__quals__j_e_i_Any_j_e_i_Default.o_u_e_w_c_c_b_UberfireBreadcrumbsViewTemplateResource::getStyle()();
    }
    return null;
  }-*/;
}
