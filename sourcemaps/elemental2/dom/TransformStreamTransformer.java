/*
 * Copyright 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package elemental2.dom;

import elemental2.promise.IThenable;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface TransformStreamTransformer<IN_VALUE, OUT_VALUE> {
  @JsFunction
  public interface FlushFn<OUT_VALUE> {
    IThenable<Object> onInvoke(TransformStreamDefaultController<OUT_VALUE> p0);
  }

  @JsFunction
  public interface StartFn<OUT_VALUE> {
    IThenable<Object> onInvoke(TransformStreamDefaultController<OUT_VALUE> p0);
  }

  @JsFunction
  public interface TransformFn<IN_VALUE, OUT_VALUE> {
    IThenable<Object> onInvoke(IN_VALUE p0, TransformStreamDefaultController<OUT_VALUE> p1);
  }

  @JsOverlay
  static TransformStreamTransformer create() {
    return Js.uncheckedCast(JsPropertyMap.of());
  }

  @JsProperty
  TransformStreamTransformer.FlushFn<OUT_VALUE> getFlush();

  @JsProperty
  TransformStreamTransformer.StartFn<OUT_VALUE> getStart();

  @JsProperty
  TransformStreamTransformer.TransformFn<IN_VALUE, OUT_VALUE> getTransform();

  @JsProperty
  void setFlush(TransformStreamTransformer.FlushFn<OUT_VALUE> flush);

  @JsProperty
  void setStart(TransformStreamTransformer.StartFn<OUT_VALUE> start);

  @JsProperty
  void setTransform(TransformStreamTransformer.TransformFn<? super IN_VALUE, OUT_VALUE> transform);
}
