package io.github.sskorol.cdt.protocol.types.css;

/*-
 * #%L
 * cdt-java-client
 * %%
 * Copyright (C) 2018 - 2022 Sergey Korol
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import io.github.sskorol.cdt.protocol.support.annotations.Experimental;
import io.github.sskorol.cdt.protocol.support.annotations.Optional;
import java.util.List;

/** CSS rule representation. */
public class CSSRule {

  @Optional private String styleSheetId;

  private SelectorList selectorList;

  private StyleSheetOrigin origin;

  private CSSStyle style;

  @Optional private List<CSSMedia> media;

  @Experimental @Optional private List<CSSContainerQuery> containerQueries;

  @Experimental @Optional private List<CSSSupports> supports;

  @Experimental @Optional private List<CSSLayer> layers;

  /**
   * The css style sheet identifier (absent for user agent stylesheet and user-specified stylesheet
   * rules) this rule came from.
   */
  public String getStyleSheetId() {
    return styleSheetId;
  }

  /**
   * The css style sheet identifier (absent for user agent stylesheet and user-specified stylesheet
   * rules) this rule came from.
   */
  public void setStyleSheetId(String styleSheetId) {
    this.styleSheetId = styleSheetId;
  }

  /** Rule selector data. */
  public SelectorList getSelectorList() {
    return selectorList;
  }

  /** Rule selector data. */
  public void setSelectorList(SelectorList selectorList) {
    this.selectorList = selectorList;
  }

  /** Parent stylesheet's origin. */
  public StyleSheetOrigin getOrigin() {
    return origin;
  }

  /** Parent stylesheet's origin. */
  public void setOrigin(StyleSheetOrigin origin) {
    this.origin = origin;
  }

  /** Associated style declaration. */
  public CSSStyle getStyle() {
    return style;
  }

  /** Associated style declaration. */
  public void setStyle(CSSStyle style) {
    this.style = style;
  }

  /**
   * Media list array (for rules involving media queries). The array enumerates media queries
   * starting with the innermost one, going outwards.
   */
  public List<CSSMedia> getMedia() {
    return media;
  }

  /**
   * Media list array (for rules involving media queries). The array enumerates media queries
   * starting with the innermost one, going outwards.
   */
  public void setMedia(List<CSSMedia> media) {
    this.media = media;
  }

  /**
   * Container query list array (for rules involving container queries). The array enumerates
   * container queries starting with the innermost one, going outwards.
   */
  public List<CSSContainerQuery> getContainerQueries() {
    return containerQueries;
  }

  /**
   * Container query list array (for rules involving container queries). The array enumerates
   * container queries starting with the innermost one, going outwards.
   */
  public void setContainerQueries(List<CSSContainerQuery> containerQueries) {
    this.containerQueries = containerQueries;
  }

  /**
   * @supports CSS at-rule array. The array enumerates @supports at-rules starting with the
   *     innermost one, going outwards.
   */
  public List<CSSSupports> getSupports() {
    return supports;
  }

  /**
   * @supports CSS at-rule array. The array enumerates @supports at-rules starting with the
   *     innermost one, going outwards.
   */
  public void setSupports(List<CSSSupports> supports) {
    this.supports = supports;
  }

  /**
   * Cascade layer array. Contains the layer hierarchy that this rule belongs to starting with the
   * innermost layer and going outwards.
   */
  public List<CSSLayer> getLayers() {
    return layers;
  }

  /**
   * Cascade layer array. Contains the layer hierarchy that this rule belongs to starting with the
   * innermost layer and going outwards.
   */
  public void setLayers(List<CSSLayer> layers) {
    this.layers = layers;
  }
}
