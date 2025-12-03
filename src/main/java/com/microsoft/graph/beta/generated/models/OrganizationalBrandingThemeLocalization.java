package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationalBrandingThemeLocalization implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link OrganizationalBrandingThemeLocalization} and sets the default values.
     */
    public OrganizationalBrandingThemeLocalization() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OrganizationalBrandingThemeLocalization}
     */
    @jakarta.annotation.Nonnull
    public static OrganizationalBrandingThemeLocalization createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationalBrandingThemeLocalization();
    }
    /**
     * Gets the accountResetCredentials property value. Represents &apos;Can&apos;t access your account?&apos; and &apos;Reset it now&apos; hyperlinks of self-service password reset (SSPR) that can be customized on the sign-in page for a theme. A destination URL can be updated. Optional.
     * @return a {@link LoginPageBrandingVisualElement}
     */
    @jakarta.annotation.Nullable
    public LoginPageBrandingVisualElement getAccountResetCredentials() {
        return this.backingStore.get("accountResetCredentials");
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backgroundImage property value. Image that appears as the background of the sign-in page. The allowed types are PNG or JPEG not smaller than 300 KB and not larger than 1920  1080 pixels. A smaller image will reduce bandwidth requirements and make the page load faster. Optional.
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getBackgroundImage() {
        return this.backingStore.get("backgroundImage");
    }
    /**
     * Gets the backgroundImageRelativeUrl property value. A relative url for the backgroundImage property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only. Optional.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBackgroundImageRelativeUrl() {
        return this.backingStore.get("backgroundImageRelativeUrl");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the bannerLogo property value. A banner version of your company logo that appears on the sign-in page. The allowed types are PNG or JPEG not larger than 245 x 36 pixels. We recommend using a transparent image with no padding around the logo. Optional.
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getBannerLogo() {
        return this.backingStore.get("bannerLogo");
    }
    /**
     * Gets the bannerLogoRelativeUrl property value. A relative url for the bannerLogo property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only. Optional.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBannerLogoRelativeUrl() {
        return this.backingStore.get("bannerLogoRelativeUrl");
    }
    /**
     * Gets the cannotAccessYourAccount property value. Represents &apos;Can&apos;t access your account?&apos; hyperlink of self-service password reset (SSPR) that can be customized on the sign-in page for a theme. A display text can be updated. Optional.
     * @return a {@link LoginPageBrandingVisualElement}
     */
    @jakarta.annotation.Nullable
    public LoginPageBrandingVisualElement getCannotAccessYourAccount() {
        return this.backingStore.get("cannotAccessYourAccount");
    }
    /**
     * Gets the cdnHosts property value. A list of available CDN base urls that are serving the assets of the current resource. There are several CDNs used to provide redundancy hence eliminating Single Point of Failure for blob properties of this resource. Read-only. Optional.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCdnHosts() {
        return this.backingStore.get("cdnHosts");
    }
    /**
     * Gets the contentCustomization property value. Represents the various content options to be customized throughout the authentication flow for a tenant. NOTE: Supported by Microsoft Entra ID for customer tenants only. Optional.
     * @return a {@link ContentCustomization}
     */
    @jakarta.annotation.Nullable
    public ContentCustomization getContentCustomization() {
        return this.backingStore.get("contentCustomization");
    }
    /**
     * Gets the customCSS property value. CSS styling that appears on the sign-in page. The allowed format is .css format only and not larger than 25KB. Optional.
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getCustomCSS() {
        return this.backingStore.get("customCSS");
    }
    /**
     * Gets the customCSSRelativeUrl property value. A relative url for the customCSS property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only. Optional.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCustomCSSRelativeUrl() {
        return this.backingStore.get("customCSSRelativeUrl");
    }
    /**
     * Gets the favicon property value. A custom icon (favicon) to replace a default Microsoft product favicon on a Microsoft Entra tenant. Optional.
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getFavicon() {
        return this.backingStore.get("favicon");
    }
    /**
     * Gets the faviconRelativeUrl property value. A relative url for the favicon property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only. Optional.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFaviconRelativeUrl() {
        return this.backingStore.get("faviconRelativeUrl");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(29);
        deserializerMap.put("accountResetCredentials", (n) -> { this.setAccountResetCredentials(n.getObjectValue(LoginPageBrandingVisualElement::createFromDiscriminatorValue)); });
        deserializerMap.put("backgroundImage", (n) -> { this.setBackgroundImage(n.getByteArrayValue()); });
        deserializerMap.put("backgroundImageRelativeUrl", (n) -> { this.setBackgroundImageRelativeUrl(n.getStringValue()); });
        deserializerMap.put("bannerLogo", (n) -> { this.setBannerLogo(n.getByteArrayValue()); });
        deserializerMap.put("bannerLogoRelativeUrl", (n) -> { this.setBannerLogoRelativeUrl(n.getStringValue()); });
        deserializerMap.put("cannotAccessYourAccount", (n) -> { this.setCannotAccessYourAccount(n.getObjectValue(LoginPageBrandingVisualElement::createFromDiscriminatorValue)); });
        deserializerMap.put("cdnHosts", (n) -> { this.setCdnHosts(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("contentCustomization", (n) -> { this.setContentCustomization(n.getObjectValue(ContentCustomization::createFromDiscriminatorValue)); });
        deserializerMap.put("customCSS", (n) -> { this.setCustomCSS(n.getByteArrayValue()); });
        deserializerMap.put("customCSSRelativeUrl", (n) -> { this.setCustomCSSRelativeUrl(n.getStringValue()); });
        deserializerMap.put("favicon", (n) -> { this.setFavicon(n.getByteArrayValue()); });
        deserializerMap.put("faviconRelativeUrl", (n) -> { this.setFaviconRelativeUrl(n.getStringValue()); });
        deserializerMap.put("forgotMyPassword", (n) -> { this.setForgotMyPassword(n.getObjectValue(LoginPageBrandingVisualElement::createFromDiscriminatorValue)); });
        deserializerMap.put("headerBackgroundColor", (n) -> { this.setHeaderBackgroundColor(n.getStringValue()); });
        deserializerMap.put("headerLogo", (n) -> { this.setHeaderLogo(n.getByteArrayValue()); });
        deserializerMap.put("headerLogoRelativeUrl", (n) -> { this.setHeaderLogoRelativeUrl(n.getStringValue()); });
        deserializerMap.put("locale", (n) -> { this.setLocale(n.getStringValue()); });
        deserializerMap.put("loginPageLayoutConfiguration", (n) -> { this.setLoginPageLayoutConfiguration(n.getObjectValue(LoginPageLayoutConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("pageBackgroundColor", (n) -> { this.setPageBackgroundColor(n.getStringValue()); });
        deserializerMap.put("privacyAndCookies", (n) -> { this.setPrivacyAndCookies(n.getObjectValue(LoginPageBrandingVisualElement::createFromDiscriminatorValue)); });
        deserializerMap.put("resetItNow", (n) -> { this.setResetItNow(n.getObjectValue(LoginPageBrandingVisualElement::createFromDiscriminatorValue)); });
        deserializerMap.put("signInPageText", (n) -> { this.setSignInPageText(n.getStringValue()); });
        deserializerMap.put("squareLogo", (n) -> { this.setSquareLogo(n.getByteArrayValue()); });
        deserializerMap.put("squareLogoDark", (n) -> { this.setSquareLogoDark(n.getByteArrayValue()); });
        deserializerMap.put("squareLogoDarkRelativeUrl", (n) -> { this.setSquareLogoDarkRelativeUrl(n.getStringValue()); });
        deserializerMap.put("squareLogoRelativeUrl", (n) -> { this.setSquareLogoRelativeUrl(n.getStringValue()); });
        deserializerMap.put("termsOfUse", (n) -> { this.setTermsOfUse(n.getObjectValue(LoginPageBrandingVisualElement::createFromDiscriminatorValue)); });
        deserializerMap.put("usernameHintText", (n) -> { this.setUsernameHintText(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the forgotMyPassword property value. Represents &apos;Forgot my password&apos; hyperlink of self-service password reset (SSPR) that can be customized on the sign-in page for a theme. A display text can be updated. Optional.
     * @return a {@link LoginPageBrandingVisualElement}
     */
    @jakarta.annotation.Nullable
    public LoginPageBrandingVisualElement getForgotMyPassword() {
        return this.backingStore.get("forgotMyPassword");
    }
    /**
     * Gets the headerBackgroundColor property value. The RGB color to apply to customize the color of the header. Optional.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHeaderBackgroundColor() {
        return this.backingStore.get("headerBackgroundColor");
    }
    /**
     * Gets the headerLogo property value. A company logo that appears in the header of the sign-in page. The allowed types are PNG or JPEG not larger than 245 x 36 pixels. We recommend using a transparent image with no padding around the logo. Optional.
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getHeaderLogo() {
        return this.backingStore.get("headerLogo");
    }
    /**
     * Gets the headerLogoRelativeUrl property value. A relative url for the headerLogo property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only. Optional.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHeaderLogoRelativeUrl() {
        return this.backingStore.get("headerLogoRelativeUrl");
    }
    /**
     * Gets the locale property value. An identifier that represents the locale specified using culture names. Culture names follow the RFC 1766 standard in the format &apos;languagecode2-country/regioncode2&apos;. The portion &apos;languagecode2&apos; is a lowercase two-letter code derived from ISO 639-1 and &apos;country/regioncode2&apos; is an uppercase two-letter code derived from ISO 3166. For example, U.S. English is en-US. You can&apos;t create the default branding by setting the value of locale to the String types 0 or default.  NOTE: Multiple branding for a single locale are currently not supported.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocale() {
        return this.backingStore.get("locale");
    }
    /**
     * Gets the loginPageLayoutConfiguration property value. Represents the layout configuration to be displayed on the login page for a tenant. Optional.
     * @return a {@link LoginPageLayoutConfiguration}
     */
    @jakarta.annotation.Nullable
    public LoginPageLayoutConfiguration getLoginPageLayoutConfiguration() {
        return this.backingStore.get("loginPageLayoutConfiguration");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the pageBackgroundColor property value. Color that appears in place of the background image in low-bandwidth connections. We recommend that you use the primary color of your banner logo or your organization color. Specify this in hexadecimal format, for example, white is #FFFFFF. Optional.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPageBackgroundColor() {
        return this.backingStore.get("pageBackgroundColor");
    }
    /**
     * Gets the privacyAndCookies property value. Represents &apos;Privacy &amp; cookies&apos; hyperlink in the footer of sign-in page that can be customized for a theme. A destination URL and a display text can be updated. Optional.
     * @return a {@link LoginPageBrandingVisualElement}
     */
    @jakarta.annotation.Nullable
    public LoginPageBrandingVisualElement getPrivacyAndCookies() {
        return this.backingStore.get("privacyAndCookies");
    }
    /**
     * Gets the resetItNow property value. Represents &apos;Reset it now&apos; hyperlink of self-service password reset (SSPR) that can be customized on the sign-in page for a theme. A display text can be updated. Optional.
     * @return a {@link LoginPageBrandingVisualElement}
     */
    @jakarta.annotation.Nullable
    public LoginPageBrandingVisualElement getResetItNow() {
        return this.backingStore.get("resetItNow");
    }
    /**
     * Gets the signInPageText property value. Text that appears at the bottom of the sign-in box. Use this to communicate additional information, such as the phone number to your help desk or a legal statement. This text must be in Unicode format and not exceed 1024 characters. Optional.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSignInPageText() {
        return this.backingStore.get("signInPageText");
    }
    /**
     * Gets the squareLogo property value. A square version of your company logo that appears in Windows 10 out-of-box experiences (OOBE) and when Windows Autopilot is enabled for deployment. Allowed types are PNG or JPEG not larger than 240 x 240 pixels and not more than 10 KB in size. We recommend using a transparent image with no padding around the logo. Optional.
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getSquareLogo() {
        return this.backingStore.get("squareLogo");
    }
    /**
     * Gets the squareLogoDark property value. A square dark version of your company logo that appears in Windows 10 out-of-box experiences (OOBE) and when Windows Autopilot is enabled for deployment. Allowed types are PNG or JPEG not larger than 240 x 240 pixels and not more than 10 KB in size. We recommend using a transparent image with no padding around the logo. Optional.
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getSquareLogoDark() {
        return this.backingStore.get("squareLogoDark");
    }
    /**
     * Gets the squareLogoDarkRelativeUrl property value. A relative url for the squareLogoDark property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only. Optional.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSquareLogoDarkRelativeUrl() {
        return this.backingStore.get("squareLogoDarkRelativeUrl");
    }
    /**
     * Gets the squareLogoRelativeUrl property value. A relative url for the squareLogo property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only. Optional.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSquareLogoRelativeUrl() {
        return this.backingStore.get("squareLogoRelativeUrl");
    }
    /**
     * Gets the termsOfUse property value. Represents the Terms of Use hyperlink that can be customized in the footer of the login page for a theme. A destination URL and a display text can be updated. Optional.
     * @return a {@link LoginPageBrandingVisualElement}
     */
    @jakarta.annotation.Nullable
    public LoginPageBrandingVisualElement getTermsOfUse() {
        return this.backingStore.get("termsOfUse");
    }
    /**
     * Gets the usernameHintText property value. A string that appears as the hint in the username text box on the sign-in screen. This text must be Unicode, contain no links or code, and can&apos;t exceed 64 characters. Optional.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUsernameHintText() {
        return this.backingStore.get("usernameHintText");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("accountResetCredentials", this.getAccountResetCredentials());
        writer.writeByteArrayValue("backgroundImage", this.getBackgroundImage());
        writer.writeStringValue("backgroundImageRelativeUrl", this.getBackgroundImageRelativeUrl());
        writer.writeByteArrayValue("bannerLogo", this.getBannerLogo());
        writer.writeStringValue("bannerLogoRelativeUrl", this.getBannerLogoRelativeUrl());
        writer.writeObjectValue("cannotAccessYourAccount", this.getCannotAccessYourAccount());
        writer.writeCollectionOfPrimitiveValues("cdnHosts", this.getCdnHosts());
        writer.writeObjectValue("contentCustomization", this.getContentCustomization());
        writer.writeByteArrayValue("customCSS", this.getCustomCSS());
        writer.writeStringValue("customCSSRelativeUrl", this.getCustomCSSRelativeUrl());
        writer.writeByteArrayValue("favicon", this.getFavicon());
        writer.writeStringValue("faviconRelativeUrl", this.getFaviconRelativeUrl());
        writer.writeObjectValue("forgotMyPassword", this.getForgotMyPassword());
        writer.writeStringValue("headerBackgroundColor", this.getHeaderBackgroundColor());
        writer.writeByteArrayValue("headerLogo", this.getHeaderLogo());
        writer.writeStringValue("headerLogoRelativeUrl", this.getHeaderLogoRelativeUrl());
        writer.writeStringValue("locale", this.getLocale());
        writer.writeObjectValue("loginPageLayoutConfiguration", this.getLoginPageLayoutConfiguration());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("pageBackgroundColor", this.getPageBackgroundColor());
        writer.writeObjectValue("privacyAndCookies", this.getPrivacyAndCookies());
        writer.writeObjectValue("resetItNow", this.getResetItNow());
        writer.writeStringValue("signInPageText", this.getSignInPageText());
        writer.writeByteArrayValue("squareLogo", this.getSquareLogo());
        writer.writeByteArrayValue("squareLogoDark", this.getSquareLogoDark());
        writer.writeStringValue("squareLogoDarkRelativeUrl", this.getSquareLogoDarkRelativeUrl());
        writer.writeStringValue("squareLogoRelativeUrl", this.getSquareLogoRelativeUrl());
        writer.writeObjectValue("termsOfUse", this.getTermsOfUse());
        writer.writeStringValue("usernameHintText", this.getUsernameHintText());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accountResetCredentials property value. Represents &apos;Can&apos;t access your account?&apos; and &apos;Reset it now&apos; hyperlinks of self-service password reset (SSPR) that can be customized on the sign-in page for a theme. A destination URL can be updated. Optional.
     * @param value Value to set for the accountResetCredentials property.
     */
    public void setAccountResetCredentials(@jakarta.annotation.Nullable final LoginPageBrandingVisualElement value) {
        this.backingStore.set("accountResetCredentials", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backgroundImage property value. Image that appears as the background of the sign-in page. The allowed types are PNG or JPEG not smaller than 300 KB and not larger than 1920  1080 pixels. A smaller image will reduce bandwidth requirements and make the page load faster. Optional.
     * @param value Value to set for the backgroundImage property.
     */
    public void setBackgroundImage(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("backgroundImage", value);
    }
    /**
     * Sets the backgroundImageRelativeUrl property value. A relative url for the backgroundImage property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only. Optional.
     * @param value Value to set for the backgroundImageRelativeUrl property.
     */
    public void setBackgroundImageRelativeUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("backgroundImageRelativeUrl", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the bannerLogo property value. A banner version of your company logo that appears on the sign-in page. The allowed types are PNG or JPEG not larger than 245 x 36 pixels. We recommend using a transparent image with no padding around the logo. Optional.
     * @param value Value to set for the bannerLogo property.
     */
    public void setBannerLogo(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("bannerLogo", value);
    }
    /**
     * Sets the bannerLogoRelativeUrl property value. A relative url for the bannerLogo property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only. Optional.
     * @param value Value to set for the bannerLogoRelativeUrl property.
     */
    public void setBannerLogoRelativeUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("bannerLogoRelativeUrl", value);
    }
    /**
     * Sets the cannotAccessYourAccount property value. Represents &apos;Can&apos;t access your account?&apos; hyperlink of self-service password reset (SSPR) that can be customized on the sign-in page for a theme. A display text can be updated. Optional.
     * @param value Value to set for the cannotAccessYourAccount property.
     */
    public void setCannotAccessYourAccount(@jakarta.annotation.Nullable final LoginPageBrandingVisualElement value) {
        this.backingStore.set("cannotAccessYourAccount", value);
    }
    /**
     * Sets the cdnHosts property value. A list of available CDN base urls that are serving the assets of the current resource. There are several CDNs used to provide redundancy hence eliminating Single Point of Failure for blob properties of this resource. Read-only. Optional.
     * @param value Value to set for the cdnHosts property.
     */
    public void setCdnHosts(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("cdnHosts", value);
    }
    /**
     * Sets the contentCustomization property value. Represents the various content options to be customized throughout the authentication flow for a tenant. NOTE: Supported by Microsoft Entra ID for customer tenants only. Optional.
     * @param value Value to set for the contentCustomization property.
     */
    public void setContentCustomization(@jakarta.annotation.Nullable final ContentCustomization value) {
        this.backingStore.set("contentCustomization", value);
    }
    /**
     * Sets the customCSS property value. CSS styling that appears on the sign-in page. The allowed format is .css format only and not larger than 25KB. Optional.
     * @param value Value to set for the customCSS property.
     */
    public void setCustomCSS(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("customCSS", value);
    }
    /**
     * Sets the customCSSRelativeUrl property value. A relative url for the customCSS property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only. Optional.
     * @param value Value to set for the customCSSRelativeUrl property.
     */
    public void setCustomCSSRelativeUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customCSSRelativeUrl", value);
    }
    /**
     * Sets the favicon property value. A custom icon (favicon) to replace a default Microsoft product favicon on a Microsoft Entra tenant. Optional.
     * @param value Value to set for the favicon property.
     */
    public void setFavicon(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("favicon", value);
    }
    /**
     * Sets the faviconRelativeUrl property value. A relative url for the favicon property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only. Optional.
     * @param value Value to set for the faviconRelativeUrl property.
     */
    public void setFaviconRelativeUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("faviconRelativeUrl", value);
    }
    /**
     * Sets the forgotMyPassword property value. Represents &apos;Forgot my password&apos; hyperlink of self-service password reset (SSPR) that can be customized on the sign-in page for a theme. A display text can be updated. Optional.
     * @param value Value to set for the forgotMyPassword property.
     */
    public void setForgotMyPassword(@jakarta.annotation.Nullable final LoginPageBrandingVisualElement value) {
        this.backingStore.set("forgotMyPassword", value);
    }
    /**
     * Sets the headerBackgroundColor property value. The RGB color to apply to customize the color of the header. Optional.
     * @param value Value to set for the headerBackgroundColor property.
     */
    public void setHeaderBackgroundColor(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("headerBackgroundColor", value);
    }
    /**
     * Sets the headerLogo property value. A company logo that appears in the header of the sign-in page. The allowed types are PNG or JPEG not larger than 245 x 36 pixels. We recommend using a transparent image with no padding around the logo. Optional.
     * @param value Value to set for the headerLogo property.
     */
    public void setHeaderLogo(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("headerLogo", value);
    }
    /**
     * Sets the headerLogoRelativeUrl property value. A relative url for the headerLogo property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only. Optional.
     * @param value Value to set for the headerLogoRelativeUrl property.
     */
    public void setHeaderLogoRelativeUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("headerLogoRelativeUrl", value);
    }
    /**
     * Sets the locale property value. An identifier that represents the locale specified using culture names. Culture names follow the RFC 1766 standard in the format &apos;languagecode2-country/regioncode2&apos;. The portion &apos;languagecode2&apos; is a lowercase two-letter code derived from ISO 639-1 and &apos;country/regioncode2&apos; is an uppercase two-letter code derived from ISO 3166. For example, U.S. English is en-US. You can&apos;t create the default branding by setting the value of locale to the String types 0 or default.  NOTE: Multiple branding for a single locale are currently not supported.
     * @param value Value to set for the locale property.
     */
    public void setLocale(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("locale", value);
    }
    /**
     * Sets the loginPageLayoutConfiguration property value. Represents the layout configuration to be displayed on the login page for a tenant. Optional.
     * @param value Value to set for the loginPageLayoutConfiguration property.
     */
    public void setLoginPageLayoutConfiguration(@jakarta.annotation.Nullable final LoginPageLayoutConfiguration value) {
        this.backingStore.set("loginPageLayoutConfiguration", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the pageBackgroundColor property value. Color that appears in place of the background image in low-bandwidth connections. We recommend that you use the primary color of your banner logo or your organization color. Specify this in hexadecimal format, for example, white is #FFFFFF. Optional.
     * @param value Value to set for the pageBackgroundColor property.
     */
    public void setPageBackgroundColor(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("pageBackgroundColor", value);
    }
    /**
     * Sets the privacyAndCookies property value. Represents &apos;Privacy &amp; cookies&apos; hyperlink in the footer of sign-in page that can be customized for a theme. A destination URL and a display text can be updated. Optional.
     * @param value Value to set for the privacyAndCookies property.
     */
    public void setPrivacyAndCookies(@jakarta.annotation.Nullable final LoginPageBrandingVisualElement value) {
        this.backingStore.set("privacyAndCookies", value);
    }
    /**
     * Sets the resetItNow property value. Represents &apos;Reset it now&apos; hyperlink of self-service password reset (SSPR) that can be customized on the sign-in page for a theme. A display text can be updated. Optional.
     * @param value Value to set for the resetItNow property.
     */
    public void setResetItNow(@jakarta.annotation.Nullable final LoginPageBrandingVisualElement value) {
        this.backingStore.set("resetItNow", value);
    }
    /**
     * Sets the signInPageText property value. Text that appears at the bottom of the sign-in box. Use this to communicate additional information, such as the phone number to your help desk or a legal statement. This text must be in Unicode format and not exceed 1024 characters. Optional.
     * @param value Value to set for the signInPageText property.
     */
    public void setSignInPageText(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("signInPageText", value);
    }
    /**
     * Sets the squareLogo property value. A square version of your company logo that appears in Windows 10 out-of-box experiences (OOBE) and when Windows Autopilot is enabled for deployment. Allowed types are PNG or JPEG not larger than 240 x 240 pixels and not more than 10 KB in size. We recommend using a transparent image with no padding around the logo. Optional.
     * @param value Value to set for the squareLogo property.
     */
    public void setSquareLogo(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("squareLogo", value);
    }
    /**
     * Sets the squareLogoDark property value. A square dark version of your company logo that appears in Windows 10 out-of-box experiences (OOBE) and when Windows Autopilot is enabled for deployment. Allowed types are PNG or JPEG not larger than 240 x 240 pixels and not more than 10 KB in size. We recommend using a transparent image with no padding around the logo. Optional.
     * @param value Value to set for the squareLogoDark property.
     */
    public void setSquareLogoDark(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("squareLogoDark", value);
    }
    /**
     * Sets the squareLogoDarkRelativeUrl property value. A relative url for the squareLogoDark property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only. Optional.
     * @param value Value to set for the squareLogoDarkRelativeUrl property.
     */
    public void setSquareLogoDarkRelativeUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("squareLogoDarkRelativeUrl", value);
    }
    /**
     * Sets the squareLogoRelativeUrl property value. A relative url for the squareLogo property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only. Optional.
     * @param value Value to set for the squareLogoRelativeUrl property.
     */
    public void setSquareLogoRelativeUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("squareLogoRelativeUrl", value);
    }
    /**
     * Sets the termsOfUse property value. Represents the Terms of Use hyperlink that can be customized in the footer of the login page for a theme. A destination URL and a display text can be updated. Optional.
     * @param value Value to set for the termsOfUse property.
     */
    public void setTermsOfUse(@jakarta.annotation.Nullable final LoginPageBrandingVisualElement value) {
        this.backingStore.set("termsOfUse", value);
    }
    /**
     * Sets the usernameHintText property value. A string that appears as the hint in the username text box on the sign-in screen. This text must be Unicode, contain no links or code, and can&apos;t exceed 64 characters. Optional.
     * @param value Value to set for the usernameHintText property.
     */
    public void setUsernameHintText(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("usernameHintText", value);
    }
}
