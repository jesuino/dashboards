package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import org.dashbuilder.client.navigation.event.NavItemEditCancelledEvent;
import org.dashbuilder.client.navigation.event.NavItemEditStartedEvent;
import org.dashbuilder.client.navigation.plugin.PerspectivePluginManager;
import org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditor;
import org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView;
import org.dashbuilder.client.navigation.widget.editor.NavItemEditor;
import org.dashbuilder.client.navigation.widget.editor.TargetPerspectiveEditor;
import org.dashbuilder.client.plugins.RuntimePerspectivePluginManager;
import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.SyncBeanManager;
import org.uberfire.client.mvp.PlaceManager;
import org.uberfire.client.mvp.PlaceManagerImpl;

public class Type_factory__o_d_c_n_w_e_NavItemDefaultEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<NavItemDefaultEditor> { public Type_factory__o_d_c_n_w_e_NavItemDefaultEditor__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(NavItemDefaultEditor.class, "Type_factory__o_d_c_n_w_e_NavItemDefaultEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { NavItemDefaultEditor.class, NavItemEditor.class, Object.class, IsElement.class });
  }

  public NavItemDefaultEditor createInstance(final ContextManager contextManager) {
    final PerspectivePluginManager _perspectivePluginManager_4 = (RuntimePerspectivePluginManager) contextManager.getInstance("Type_factory__o_d_c_p_RuntimePerspectivePluginManager__quals__j_e_i_Any_j_e_i_Default");
    final SyncBeanManager _beanManager_1 = (SyncBeanManager) contextManager.getInstance("Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default");
    final PlaceManager _placeManager_2 = (PlaceManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final TargetPerspectiveEditor _targetPerspectiveEditor_3 = (TargetPerspectiveEditor) contextManager.getInstance("Type_factory__o_d_c_n_w_e_TargetPerspectiveEditor__quals__j_e_i_Any_j_e_i_Default");
    final Event<NavItemEditCancelledEvent> _navItemEditCancelledEvent_6 = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { NavItemEditCancelledEvent.class }, new Annotation[] { });
    final NavItemDefaultEditorView _view_0 = (NavItemDefaultEditorView) contextManager.getInstance("Type_factory__o_d_c_n_w_e_NavItemDefaultEditorView__quals__j_e_i_Any_j_e_i_Default");
    final Event<NavItemEditStartedEvent> _navItemEditStartedEvent_5 = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { NavItemEditStartedEvent.class }, new Annotation[] { });
    final NavItemDefaultEditor instance = new NavItemDefaultEditor(_view_0, _beanManager_1, _placeManager_2, _targetPerspectiveEditor_3, _perspectivePluginManager_4, _navItemEditStartedEvent_5, _navItemEditCancelledEvent_6);
    registerDependentScopedReference(instance, _beanManager_1);
    registerDependentScopedReference(instance, _targetPerspectiveEditor_3);
    registerDependentScopedReference(instance, _navItemEditCancelledEvent_6);
    registerDependentScopedReference(instance, _view_0);
    registerDependentScopedReference(instance, _navItemEditStartedEvent_5);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}