define(
  "ace/ext/prompt",
  [
    "require",
    "exports",
    "module",
    "ace/lib/lang",
    "ace/lib/dom",
    "ace/lib/event",
    "ace/edit_session",
    "ace/undomanager",
    "ace/virtual_renderer",
    "ace/editor",
    "ace/multi_select",
  ],
  function (e, t, n) {
    function c(e, t) {
      var n = this.pixelToScreenCoordinates(e, t);
      return this.session.screenToDocumentPosition(
        Math.min(this.session.getScreenLength() - 1, Math.max(n.row, 0)),
        Math.max(n.column, 0)
      );
    }
    var r = e("../lib/lang"),
      i = e("ace/lib/dom"),
      s = e("ace/lib/event"),
      o = e("ace/edit_session").EditSession,
      u = e("ace/undomanager").UndoManager,
      a = e("ace/virtual_renderer").VirtualRenderer,
      f = e("ace/editor").Editor,
      l = e("ace/multi_select").MultiSelect;
    t.singleLineEditor = function (e) {
      var t = new a();
      (t.container.style.overflow = "hidden"), (t.screenToTextCoordinates = c), t.setStyle("ace_one-line");
      var n = new f(t);
      return (
        n.session.setUndoManager(new u()),
        n.setOptions({ showPrintMargin: !1, showGutter: !1, highlightGutterLine: !1, focusWaitTimout: 0, maxLines: 4 }),
        n
      );
    };
  }
),
  (function () {
    window.require(["ace/ext/prompt"], function () {});
  })();
