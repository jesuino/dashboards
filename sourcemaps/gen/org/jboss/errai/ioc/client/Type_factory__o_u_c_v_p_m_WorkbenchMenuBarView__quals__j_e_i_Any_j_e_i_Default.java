package org.jboss.errai.ioc.client;

import com.google.gwt.dom.client.Element;
import com.google.gwt.event.logical.shared.AttachEvent.Handler;
import com.google.gwt.event.logical.shared.HasAttachHandlers;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.EventListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasVisibility;
import com.google.gwt.user.client.ui.IsRenderable;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RenderableStamper;
import com.google.gwt.user.client.ui.UIObject;
import com.google.gwt.user.client.ui.Widget;
import java.lang.annotation.Annotation;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Instance;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.uberfire.client.views.pfly.menu.MainBrand;
import org.uberfire.client.views.pfly.menu.UtilityMenuBarView;
import org.uberfire.client.views.pfly.menu.WorkbenchMenuBarView;
import org.uberfire.client.views.pfly.menu.WorkbenchMenuCompactNavBarView;
import org.uberfire.client.views.pfly.menu.WorkbenchMenuStandardNavBarView;
import org.uberfire.client.workbench.widgets.menu.WorkbenchMenuBarPresenter.View;
import org.uberfire.client.workbench.widgets.menu.base.WorkbenchBaseMenuView;
import org.uberfire.mvp.Command;
import org.uberfire.workbench.model.menu.MenuPosition;

public class Type_factory__o_u_c_v_p_m_WorkbenchMenuBarView__quals__j_e_i_Any_j_e_i_Default extends Factory<WorkbenchMenuBarView> { private class Type_factory__o_u_c_v_p_m_WorkbenchMenuBarView__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends WorkbenchMenuBarView implements Proxy<WorkbenchMenuBarView> {
    private final ProxyHelper<WorkbenchMenuBarView> proxyHelper = new ProxyHelperImpl<WorkbenchMenuBarView>("Type_factory__o_u_c_v_p_m_WorkbenchMenuBarView__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final WorkbenchMenuBarView instance) {

    }

    public WorkbenchMenuBarView asBeanType() {
      return this;
    }

    public void setInstance(final WorkbenchMenuBarView instance) {
      proxyHelper.setInstance(instance);
    }

    public void clearInstance() {
      proxyHelper.clearInstance();
    }

    public void setProxyContext(final Context context) {
      proxyHelper.setProxyContext(context);
    }

    public Context getProxyContext() {
      return proxyHelper.getProxyContext();
    }

    public Object unwrap() {
      return proxyHelper.getInstance(this);
    }

    public boolean equals(Object obj) {
      obj = Factory.maybeUnwrapProxy(obj);
      return proxyHelper.getInstance(this).equals(obj);
    }

    @Override protected void setup() {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        WorkbenchMenuBarView_setup(proxiedInstance);
      } else {
        super.setup();
      }
    }

    @Override protected void setupToggle() {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        WorkbenchMenuBarView_setupToggle(proxiedInstance);
      } else {
        super.setupToggle();
      }
    }

    @Override protected void setupNavBarCollapse() {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        WorkbenchMenuBarView_setupNavBarCollapse(proxiedInstance);
      } else {
        super.setupNavBarCollapse();
      }
    }

    @Override public void addMenuItem(String id, String label, String parentId, Command command, MenuPosition position) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.addMenuItem(id, label, parentId, command, position);
      } else {
        super.addMenuItem(id, label, parentId, command, position);
      }
    }

    @Override public void addCustomMenuItem(Widget menu, MenuPosition position) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.addCustomMenuItem(menu, position);
      } else {
        super.addCustomMenuItem(menu, position);
      }
    }

    @Override public void addGroupMenuItem(String id, String label, MenuPosition position) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.addGroupMenuItem(id, label, position);
      } else {
        super.addGroupMenuItem(id, label, position);
      }
    }

    @Override public void addContextMenuItem(String menuItemId, String id, String label, String parentId, Command command, MenuPosition position) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.addContextMenuItem(menuItemId, id, label, parentId, command, position);
      } else {
        super.addContextMenuItem(menuItemId, id, label, parentId, command, position);
      }
    }

    @Override public void addContextGroupMenuItem(String menuItemId, String id, String label, MenuPosition position) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.addContextGroupMenuItem(menuItemId, id, label, position);
      } else {
        super.addContextGroupMenuItem(menuItemId, id, label, position);
      }
    }

    @Override public void clearContextMenu() {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.clearContextMenu();
      } else {
        super.clearContextMenu();
      }
    }

    @Override public void clear() {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.clear();
      } else {
        super.clear();
      }
    }

    @Override public void expand() {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.expand();
      } else {
        super.expand();
      }
    }

    @Override public void collapse() {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.collapse();
      } else {
        super.collapse();
      }
    }

    @Override public void selectMenuItem(String id) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.selectMenuItem(id);
      } else {
        super.selectMenuItem(id);
      }
    }

    @Override public void addCollapseHandler(Command command) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.addCollapseHandler(command);
      } else {
        super.addCollapseHandler(command);
      }
    }

    @Override public void addExpandHandler(Command command) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.addExpandHandler(command);
      } else {
        super.addExpandHandler(command);
      }
    }

    @Override public void enableMenuItem(String menuItemId, boolean enabled) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.enableMenuItem(menuItemId, enabled);
      } else {
        super.enableMenuItem(menuItemId, enabled);
      }
    }

    @Override public void enableContextMenuItem(String menuItemId, boolean enabled) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.enableContextMenuItem(menuItemId, enabled);
      } else {
        super.enableContextMenuItem(menuItemId, enabled);
      }
    }

    @Override public void setAllMenuItemsVisible(String perspectiveId, boolean visible) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setAllMenuItemsVisible(perspectiveId, visible);
      } else {
        super.setAllMenuItemsVisible(perspectiveId, visible);
      }
    }

    @Override public void setMenuItemVisible(String perspectiveId, boolean visible) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setMenuItemVisible(perspectiveId, visible);
      } else {
        super.setMenuItemVisible(perspectiveId, visible);
      }
    }

    @Override public void setContextMenuItemVisible(String perspectiveId, boolean visible) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setContextMenuItemVisible(perspectiveId, visible);
      } else {
        super.setContextMenuItemVisible(perspectiveId, visible);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }

    @Override public Widget asWidget() {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        final Widget retVal = proxiedInstance.asWidget();
        return retVal;
      } else {
        throw new RuntimeException("Cannot invoke public method on proxied interface before constructor completes.");
      }
    }

    @Override public void claimElement(Element element) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.claimElement(element);
      } else {
        super.claimElement(element);
      }
    }

    @Override public void initializeClaimedElement() {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.initializeClaimedElement();
      } else {
        super.initializeClaimedElement();
      }
    }

    @Override public boolean isAttached() {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        final boolean retVal = proxiedInstance.isAttached();
        return retVal;
      } else {
        return super.isAttached();
      }
    }

    @Override public void onBrowserEvent(Event event) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.onBrowserEvent(event);
      } else {
        super.onBrowserEvent(event);
      }
    }

    @Override public SafeHtml render(RenderableStamper stamper) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        final SafeHtml retVal = proxiedInstance.render(stamper);
        return retVal;
      } else {
        return super.render(stamper);
      }
    }

    @Override public void render(RenderableStamper stamper, SafeHtmlBuilder builder) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.render(stamper, builder);
      } else {
        super.render(stamper, builder);
      }
    }

    @Override protected Widget getWidget() {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        final Widget retVal = Composite_getWidget(proxiedInstance);
        return retVal;
      } else {
        return super.getWidget();
      }
    }

    @Override protected void initWidget(Widget widget) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        Composite_initWidget_Widget(proxiedInstance, widget);
      } else {
        super.initWidget(widget);
      }
    }

    @Override protected void onAttach() {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        Composite_onAttach(proxiedInstance);
      } else {
        super.onAttach();
      }
    }

    @Override protected void onDetach() {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        Composite_onDetach(proxiedInstance);
      } else {
        super.onDetach();
      }
    }

    @Override protected Element resolvePotentialElement() {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        final Element retVal = Composite_resolvePotentialElement(proxiedInstance);
        return retVal;
      } else {
        return super.resolvePotentialElement();
      }
    }

    @Override protected void setWidget(Widget widget) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        Composite_setWidget_Widget(proxiedInstance, widget);
      } else {
        super.setWidget(widget);
      }
    }

    @Override public HandlerRegistration addAttachHandler(Handler handler) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        final HandlerRegistration retVal = proxiedInstance.addAttachHandler(handler);
        return retVal;
      } else {
        return super.addAttachHandler(handler);
      }
    }

    @Override public void fireEvent(GwtEvent event) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.fireEvent(event);
      } else {
        super.fireEvent(event);
      }
    }

    @Override public Object getLayoutData() {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        final Object retVal = proxiedInstance.getLayoutData();
        return retVal;
      } else {
        return super.getLayoutData();
      }
    }

    @Override public Widget getParent() {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        final Widget retVal = proxiedInstance.getParent();
        return retVal;
      } else {
        return super.getParent();
      }
    }

    @Override public void removeFromParent() {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.removeFromParent();
      } else {
        super.removeFromParent();
      }
    }

    @Override public void setLayoutData(Object layoutData) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setLayoutData(layoutData);
      } else {
        super.setLayoutData(layoutData);
      }
    }

    @Override public void sinkEvents(int eventBitsToAdd) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.sinkEvents(eventBitsToAdd);
      } else {
        super.sinkEvents(eventBitsToAdd);
      }
    }

    @Override public void unsinkEvents(int eventBitsToRemove) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.unsinkEvents(eventBitsToRemove);
      } else {
        super.unsinkEvents(eventBitsToRemove);
      }
    }

    @Override protected HandlerManager createHandlerManager() {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        final HandlerManager retVal = Widget_createHandlerManager(proxiedInstance);
        return retVal;
      } else {
        return super.createHandlerManager();
      }
    }

    @Override protected void delegateEvent(Widget target, GwtEvent event) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        Widget_delegateEvent_Widget_GwtEvent(proxiedInstance, target, event);
      } else {
        super.delegateEvent(target, event);
      }
    }

    @Override protected void doAttachChildren() {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        Widget_doAttachChildren(proxiedInstance);
      } else {
        super.doAttachChildren();
      }
    }

    @Override protected void doDetachChildren() {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        Widget_doDetachChildren(proxiedInstance);
      } else {
        super.doDetachChildren();
      }
    }

    @Override protected int getHandlerCount(Type type) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = Widget_getHandlerCount_Type(proxiedInstance, type);
        return retVal;
      } else {
        return super.getHandlerCount(type);
      }
    }

    @Override protected void onLoad() {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        Widget_onLoad(proxiedInstance);
      } else {
        super.onLoad();
      }
    }

    @Override protected void onUnload() {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        Widget_onUnload(proxiedInstance);
      } else {
        super.onUnload();
      }
    }

    @Override public boolean isVisible() {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        final boolean retVal = proxiedInstance.isVisible();
        return retVal;
      } else {
        return super.isVisible();
      }
    }

    @Override public void setVisible(boolean visible) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setVisible(visible);
      } else {
        super.setVisible(visible);
      }
    }

    @Override public String getStyleName() {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.getStyleName();
        return retVal;
      } else {
        return super.getStyleName();
      }
    }

    @Override public String getStylePrimaryName() {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.getStylePrimaryName();
        return retVal;
      } else {
        return super.getStylePrimaryName();
      }
    }

    @Override public void setStyleName(String style, boolean add) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setStyleName(style, add);
      } else {
        super.setStyleName(style, add);
      }
    }

    @Override public void setStyleName(String style) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setStyleName(style);
      } else {
        super.setStyleName(style);
      }
    }

    @Override public void setStylePrimaryName(String style) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setStylePrimaryName(style);
      } else {
        super.setStylePrimaryName(style);
      }
    }

    @Override public void addStyleDependentName(String styleSuffix) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.addStyleDependentName(styleSuffix);
      } else {
        super.addStyleDependentName(styleSuffix);
      }
    }

    @Override public void addStyleName(String style) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.addStyleName(style);
      } else {
        super.addStyleName(style);
      }
    }

    @Override public int getAbsoluteLeft() {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.getAbsoluteLeft();
        return retVal;
      } else {
        return super.getAbsoluteLeft();
      }
    }

    @Override public int getAbsoluteTop() {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.getAbsoluteTop();
        return retVal;
      } else {
        return super.getAbsoluteTop();
      }
    }

    @Override public com.google.gwt.user.client.Element getElement() {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        final com.google.gwt.user.client.Element retVal = proxiedInstance.getElement();
        return retVal;
      } else {
        return super.getElement();
      }
    }

    @Override public int getOffsetHeight() {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.getOffsetHeight();
        return retVal;
      } else {
        return super.getOffsetHeight();
      }
    }

    @Override public int getOffsetWidth() {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.getOffsetWidth();
        return retVal;
      } else {
        return super.getOffsetWidth();
      }
    }

    @Override public String getTitle() {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.getTitle();
        return retVal;
      } else {
        return super.getTitle();
      }
    }

    @Override public void removeStyleDependentName(String styleSuffix) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.removeStyleDependentName(styleSuffix);
      } else {
        super.removeStyleDependentName(styleSuffix);
      }
    }

    @Override public void removeStyleName(String style) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.removeStyleName(style);
      } else {
        super.removeStyleName(style);
      }
    }

    @Override public void setHeight(String height) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setHeight(height);
      } else {
        super.setHeight(height);
      }
    }

    @Override public void setPixelSize(int width, int height) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setPixelSize(width, height);
      } else {
        super.setPixelSize(width, height);
      }
    }

    @Override public void setSize(String width, String height) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setSize(width, height);
      } else {
        super.setSize(width, height);
      }
    }

    @Override public void setStyleDependentName(String styleSuffix, boolean add) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setStyleDependentName(styleSuffix, add);
      } else {
        super.setStyleDependentName(styleSuffix, add);
      }
    }

    @Override public void setTitle(String title) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setTitle(title);
      } else {
        super.setTitle(title);
      }
    }

    @Override public void setWidth(String width) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setWidth(width);
      } else {
        super.setWidth(width);
      }
    }

    @Override public void sinkBitlessEvent(String eventTypeName) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.sinkBitlessEvent(eventTypeName);
      } else {
        super.sinkBitlessEvent(eventTypeName);
      }
    }

    @Override protected com.google.gwt.user.client.Element getStyleElement() {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        final com.google.gwt.user.client.Element retVal = UIObject_getStyleElement(proxiedInstance);
        return retVal;
      } else {
        return super.getStyleElement();
      }
    }

    @Override protected void onEnsureDebugId(String baseID) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        UIObject_onEnsureDebugId_String(proxiedInstance, baseID);
      } else {
        super.onEnsureDebugId(baseID);
      }
    }

    @Override protected void setElement(com.google.gwt.user.client.Element elem) {
      if (proxyHelper != null) {
        final WorkbenchMenuBarView proxiedInstance = proxyHelper.getInstance(this);
        UIObject_setElement_Element(proxiedInstance, elem);
      } else {
        super.setElement(elem);
      }
    }
  }
  public Type_factory__o_u_c_v_p_m_WorkbenchMenuBarView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(WorkbenchMenuBarView.class, "Type_factory__o_u_c_v_p_m_WorkbenchMenuBarView__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { WorkbenchMenuBarView.class, Composite.class, Widget.class, UIObject.class, Object.class, HasVisibility.class, EventListener.class, HasAttachHandlers.class, HasHandlers.class, IsWidget.class, IsRenderable.class, View.class, WorkbenchBaseMenuView.class });
  }

  public WorkbenchMenuBarView createInstance(final ContextManager contextManager) {
    final WorkbenchMenuBarView instance = new WorkbenchMenuBarView();
    setIncompleteInstance(instance);
    final UtilityMenuBarView WorkbenchMenuBarView_utilityMenuBarView = (UtilityMenuBarView) contextManager.getInstance("Type_factory__o_u_c_v_p_m_UtilityMenuBarView__quals__j_e_i_Any_j_e_i_Default");
    WorkbenchMenuBarView_UtilityMenuBarView_utilityMenuBarView(instance, WorkbenchMenuBarView_utilityMenuBarView);
    final WorkbenchMenuStandardNavBarView WorkbenchMenuBarView_workbenchMenuStandardNavBarView = (WorkbenchMenuStandardNavBarView) contextManager.getInstance("Type_factory__o_u_c_v_p_m_WorkbenchMenuStandardNavBarView__quals__j_e_i_Any_j_e_i_Default");
    WorkbenchMenuBarView_WorkbenchMenuStandardNavBarView_workbenchMenuStandardNavBarView(instance, WorkbenchMenuBarView_workbenchMenuStandardNavBarView);
    final WorkbenchMenuCompactNavBarView WorkbenchMenuBarView_workbenchMenuCompactNavBarView = (WorkbenchMenuCompactNavBarView) contextManager.getInstance("Type_factory__o_u_c_v_p_m_WorkbenchMenuCompactNavBarView__quals__j_e_i_Any_j_e_i_Default");
    WorkbenchMenuBarView_WorkbenchMenuCompactNavBarView_workbenchMenuCompactNavBarView(instance, WorkbenchMenuBarView_workbenchMenuCompactNavBarView);
    final Instance WorkbenchMenuBarView_menuBarBrand = (Instance) contextManager.getContextualInstance("ContextualProvider_factory__j_e_i_Instance__quals__Universal", new Class[] { MainBrand.class }, new Annotation[] { });
    registerDependentScopedReference(instance, WorkbenchMenuBarView_menuBarBrand);
    WorkbenchMenuBarView_Instance_menuBarBrand(instance, WorkbenchMenuBarView_menuBarBrand);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final WorkbenchMenuBarView instance) {
    WorkbenchMenuBarView_setup(instance);
  }

  public Proxy createProxy(final Context context) {
    final Proxy<WorkbenchMenuBarView> proxyImpl = new Type_factory__o_u_c_v_p_m_WorkbenchMenuBarView__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  native static WorkbenchMenuCompactNavBarView WorkbenchMenuBarView_WorkbenchMenuCompactNavBarView_workbenchMenuCompactNavBarView(WorkbenchMenuBarView instance) /*-{
    return instance.@org.uberfire.client.views.pfly.menu.WorkbenchMenuBarView::workbenchMenuCompactNavBarView;
  }-*/;

  native static void WorkbenchMenuBarView_WorkbenchMenuCompactNavBarView_workbenchMenuCompactNavBarView(WorkbenchMenuBarView instance, WorkbenchMenuCompactNavBarView value) /*-{
    instance.@org.uberfire.client.views.pfly.menu.WorkbenchMenuBarView::workbenchMenuCompactNavBarView = value;
  }-*/;

  native static WorkbenchMenuStandardNavBarView WorkbenchMenuBarView_WorkbenchMenuStandardNavBarView_workbenchMenuStandardNavBarView(WorkbenchMenuBarView instance) /*-{
    return instance.@org.uberfire.client.views.pfly.menu.WorkbenchMenuBarView::workbenchMenuStandardNavBarView;
  }-*/;

  native static void WorkbenchMenuBarView_WorkbenchMenuStandardNavBarView_workbenchMenuStandardNavBarView(WorkbenchMenuBarView instance, WorkbenchMenuStandardNavBarView value) /*-{
    instance.@org.uberfire.client.views.pfly.menu.WorkbenchMenuBarView::workbenchMenuStandardNavBarView = value;
  }-*/;

  native static UtilityMenuBarView WorkbenchMenuBarView_UtilityMenuBarView_utilityMenuBarView(WorkbenchMenuBarView instance) /*-{
    return instance.@org.uberfire.client.views.pfly.menu.WorkbenchMenuBarView::utilityMenuBarView;
  }-*/;

  native static void WorkbenchMenuBarView_UtilityMenuBarView_utilityMenuBarView(WorkbenchMenuBarView instance, UtilityMenuBarView value) /*-{
    instance.@org.uberfire.client.views.pfly.menu.WorkbenchMenuBarView::utilityMenuBarView = value;
  }-*/;

  native static Instance WorkbenchMenuBarView_Instance_menuBarBrand(WorkbenchMenuBarView instance) /*-{
    return instance.@org.uberfire.client.views.pfly.menu.WorkbenchMenuBarView::menuBarBrand;
  }-*/;

  native static void WorkbenchMenuBarView_Instance_menuBarBrand(WorkbenchMenuBarView instance, Instance<MainBrand> value) /*-{
    instance.@org.uberfire.client.views.pfly.menu.WorkbenchMenuBarView::menuBarBrand = value;
  }-*/;

  public native static void WorkbenchMenuBarView_setup(WorkbenchMenuBarView instance) /*-{
    instance.@org.uberfire.client.views.pfly.menu.WorkbenchMenuBarView::setup()();
  }-*/;

  public native static void WorkbenchMenuBarView_setupNavBarCollapse(WorkbenchMenuBarView instance) /*-{
    instance.@org.uberfire.client.views.pfly.menu.WorkbenchMenuBarView::setupNavBarCollapse()();
  }-*/;

  public native static void Composite_setWidget_Widget(Composite instance, Widget a0) /*-{
    instance.@com.google.gwt.user.client.ui.Composite::setWidget(Lcom/google/gwt/user/client/ui/Widget;)(a0);
  }-*/;

  public native static HandlerManager Widget_createHandlerManager(Widget instance) /*-{
    return instance.@com.google.gwt.user.client.ui.Widget::createHandlerManager()();
  }-*/;

  public native static Element Composite_resolvePotentialElement(Composite instance) /*-{
    return instance.@com.google.gwt.user.client.ui.Composite::resolvePotentialElement()();
  }-*/;

  public native static Widget Composite_getWidget(Composite instance) /*-{
    return instance.@com.google.gwt.user.client.ui.Composite::getWidget()();
  }-*/;

  public native static void Composite_onDetach(Composite instance) /*-{
    instance.@com.google.gwt.user.client.ui.Composite::onDetach()();
  }-*/;

  public native static void WorkbenchMenuBarView_setupToggle(WorkbenchMenuBarView instance) /*-{
    instance.@org.uberfire.client.views.pfly.menu.WorkbenchMenuBarView::setupToggle()();
  }-*/;

  public native static void Composite_onAttach(Composite instance) /*-{
    instance.@com.google.gwt.user.client.ui.Composite::onAttach()();
  }-*/;

  public native static void UIObject_setElement_Element(UIObject instance, com.google.gwt.user.client.Element a0) /*-{
    instance.@com.google.gwt.user.client.ui.UIObject::setElement(Lcom/google/gwt/user/client/Element;)(a0);
  }-*/;

  public native static void Widget_delegateEvent_Widget_GwtEvent(Widget instance, Widget a0, GwtEvent a1) /*-{
    instance.@com.google.gwt.user.client.ui.Widget::delegateEvent(Lcom/google/gwt/user/client/ui/Widget;Lcom/google/gwt/event/shared/GwtEvent;)(a0, a1);
  }-*/;

  public native static int Widget_getHandlerCount_Type(Widget instance, Type a0) /*-{
    return instance.@com.google.gwt.user.client.ui.Widget::getHandlerCount(Lcom/google/gwt/event/shared/GwtEvent$Type;)(a0);
  }-*/;

  public native static void Widget_doAttachChildren(Widget instance) /*-{
    instance.@com.google.gwt.user.client.ui.Widget::doAttachChildren()();
  }-*/;

  public native static com.google.gwt.user.client.Element UIObject_getStyleElement(UIObject instance) /*-{
    return instance.@com.google.gwt.user.client.ui.UIObject::getStyleElement()();
  }-*/;

  public native static void Widget_doDetachChildren(Widget instance) /*-{
    instance.@com.google.gwt.user.client.ui.Widget::doDetachChildren()();
  }-*/;

  public native static void Widget_onLoad(Widget instance) /*-{
    instance.@com.google.gwt.user.client.ui.Widget::onLoad()();
  }-*/;

  public native static void Widget_onUnload(Widget instance) /*-{
    instance.@com.google.gwt.user.client.ui.Widget::onUnload()();
  }-*/;

  public native static void UIObject_onEnsureDebugId_String(UIObject instance, String a0) /*-{
    instance.@com.google.gwt.user.client.ui.UIObject::onEnsureDebugId(Ljava/lang/String;)(a0);
  }-*/;

  public native static void Composite_initWidget_Widget(Composite instance, Widget a0) /*-{
    instance.@com.google.gwt.user.client.ui.Composite::initWidget(Lcom/google/gwt/user/client/ui/Widget;)(a0);
  }-*/;
}