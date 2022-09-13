package com.microsoft.graph.models;

import com.microsoft.graph.models.OrganizationalBranding;
import com.microsoft.graph.models.OrganizationalBrandingLocalization;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OrganizationalBrandingProperties extends Entity implements Parsable {
    /** Color that appears in place of the background image in low-bandwidth connections. We recommend that you use the primary color of your banner logo or your organization color. Specify this in hexadecimal format, for example, white is #FFFFFF. */
    private String _backgroundColor;
    /** Image that appears as the background of the sign-in page. The allowed types are PNG or JPEG not smaller than 300 KB and not larger than 1920  1080 pixels. A smaller image will reduce bandwidth requirements and make the page load faster. */
    private byte[] _backgroundImage;
    /** A relative URL for the backgroundImage property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only. */
    private String _backgroundImageRelativeUrl;
    /** A banner version of your company logo that appears on the sign-in page. The allowed types are PNG or JPEG not larger than 36  245 pixels. We recommend using a transparent image with no padding around the logo. */
    private byte[] _bannerLogo;
    /** A relative URL for the bannerLogo property that is combined with a CDN base URL from the cdnList to provide the read-only version served by a CDN. Read-only. */
    private String _bannerLogoRelativeUrl;
    /** A list of base URLs for all available CDN providers that are serving the assets of the current resource. Several CDN providers are used at the same time for high availability of read requests. Read-only. */
    private java.util.List<String> _cdnList;
    /** A custom URL for resetting account credentials. This URL must be in ASCII format or non-ASCII characters must be URL encoded, and not exceed 128 characters. */
    private String _customAccountResetCredentialsUrl;
    /** A string to replace the default 'Can't access your account?' self-service password reset (SSPR) hyperlink text on the sign-in page. This text must be in Unicode format and not exceed 256 characters. */
    private String _customCannotAccessYourAccountText;
    /** A custom URL to replace the default URL of the self-service password reset (SSPR) 'Can't access your account?' hyperlink on the sign-in page. This URL must be in ASCII format or non-ASCII characters must be URL encoded, and not exceed 128 characters. DO NOT USE. Use customAccountResetCredentialsUrl instead. */
    private String _customCannotAccessYourAccountUrl;
    /** A string to replace the default 'Forgot my password' hyperlink text on the sign-in form. This text must be in Unicode format and not exceed 256 characters. */
    private String _customForgotMyPasswordText;
    /** A string to replace the default 'Privacy and Cookies' hyperlink text in the footer. This text must be in Unicode format and not exceed 256 characters. */
    private String _customPrivacyAndCookiesText;
    /** A custom URL to replace the default URL of the 'Privacy and Cookies' hyperlink in the footer. This URL must be in ASCII format or non-ASCII characters must be URL encoded, and not exceed 128 characters. */
    private String _customPrivacyAndCookiesUrl;
    /** A string to replace the default 'reset it now' hyperlink text on the sign-in form. This text must be in Unicode format and not exceed 256 characters. DO NOT USE: Customization of the 'reset it now' hyperlink text is currently not supported. */
    private String _customResetItNowText;
    /** A string to replace the the default 'Terms of Use' hyperlink text in the footer. This text must be in Unicode format and not exceed 256 characters. */
    private String _customTermsOfUseText;
    /** A custom URL to replace the default URL of the 'Terms of Use' hyperlink in the footer. This URL must be in ASCII format or non-ASCII characters must be URL encoded, and not exceed 128characters. */
    private String _customTermsOfUseUrl;
    /** A custom icon (favicon) to replace a default Microsoft product favicon on an Azure AD tenant. */
    private byte[] _favicon;
    /** A relative url for the favicon above that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only. */
    private String _faviconRelativeUrl;
    /** The RGB color to apply to customize the color of the header. */
    private String _headerBackgroundColor;
    /** Represents the various texts that can be hidden on the login page for a tenant. */
    private LoginPageTextVisibilitySettings _loginPageTextVisibilitySettings;
    /** Text that appears at the bottom of the sign-in box. Use this to communicate additional information, such as the phone number to your help desk or a legal statement. This text must be in Unicode format and not exceed 1024 characters. */
    private String _signInPageText;
    /** A square version of your company logo that appears in Windows 10 out-of-box experiences (OOBE) and when Windows Autopilot is enabled for deployment. Allowed types are PNG or JPEG not larger than 240 x 240 pixels and not more than 10 KB in size. We recommend using a transparent image with no padding around the logo. */
    private byte[] _squareLogo;
    /** A square dark version of your company logo that appears in Windows 10 out-of-box experiences (OOBE) and when Windows Autopilot is enabled for deployment. Allowed types are PNG or JPEG not larger than 240 x 240 pixels and not more than 10 KB in size. We recommend using a transparent image with no padding around the logo. */
    private byte[] _squareLogoDark;
    /** A relative URL for the squareLogoDark property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only. */
    private String _squareLogoDarkRelativeUrl;
    /** A relative URL for the squareLogo property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only. */
    private String _squareLogoRelativeUrl;
    /** A string that shows as the hint in the username textbox on the sign-in screen. This text must be a Unicode, without links or code, and can't exceed 64 characters. */
    private String _usernameHintText;
    /**
     * Instantiates a new organizationalBrandingProperties and sets the default values.
     * @return a void
     */
    public OrganizationalBrandingProperties() {
        super();
        this.setOdataType("#microsoft.graph.organizationalBrandingProperties");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a organizationalBrandingProperties
     */
    @javax.annotation.Nonnull
    public static OrganizationalBrandingProperties createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.organizationalBranding": return new OrganizationalBranding();
                case "#microsoft.graph.organizationalBrandingLocalization": return new OrganizationalBrandingLocalization();
            }
        }
        return new OrganizationalBrandingProperties();
    }
    /**
     * Gets the backgroundColor property value. Color that appears in place of the background image in low-bandwidth connections. We recommend that you use the primary color of your banner logo or your organization color. Specify this in hexadecimal format, for example, white is #FFFFFF.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBackgroundColor() {
        return this._backgroundColor;
    }
    /**
     * Gets the backgroundImage property value. Image that appears as the background of the sign-in page. The allowed types are PNG or JPEG not smaller than 300 KB and not larger than 1920  1080 pixels. A smaller image will reduce bandwidth requirements and make the page load faster.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getBackgroundImage() {
        return this._backgroundImage;
    }
    /**
     * Gets the backgroundImageRelativeUrl property value. A relative URL for the backgroundImage property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBackgroundImageRelativeUrl() {
        return this._backgroundImageRelativeUrl;
    }
    /**
     * Gets the bannerLogo property value. A banner version of your company logo that appears on the sign-in page. The allowed types are PNG or JPEG not larger than 36  245 pixels. We recommend using a transparent image with no padding around the logo.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getBannerLogo() {
        return this._bannerLogo;
    }
    /**
     * Gets the bannerLogoRelativeUrl property value. A relative URL for the bannerLogo property that is combined with a CDN base URL from the cdnList to provide the read-only version served by a CDN. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBannerLogoRelativeUrl() {
        return this._bannerLogoRelativeUrl;
    }
    /**
     * Gets the cdnList property value. A list of base URLs for all available CDN providers that are serving the assets of the current resource. Several CDN providers are used at the same time for high availability of read requests. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getCdnList() {
        return this._cdnList;
    }
    /**
     * Gets the customAccountResetCredentialsUrl property value. A custom URL for resetting account credentials. This URL must be in ASCII format or non-ASCII characters must be URL encoded, and not exceed 128 characters.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomAccountResetCredentialsUrl() {
        return this._customAccountResetCredentialsUrl;
    }
    /**
     * Gets the customCannotAccessYourAccountText property value. A string to replace the default 'Can't access your account?' self-service password reset (SSPR) hyperlink text on the sign-in page. This text must be in Unicode format and not exceed 256 characters.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomCannotAccessYourAccountText() {
        return this._customCannotAccessYourAccountText;
    }
    /**
     * Gets the customCannotAccessYourAccountUrl property value. A custom URL to replace the default URL of the self-service password reset (SSPR) 'Can't access your account?' hyperlink on the sign-in page. This URL must be in ASCII format or non-ASCII characters must be URL encoded, and not exceed 128 characters. DO NOT USE. Use customAccountResetCredentialsUrl instead.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomCannotAccessYourAccountUrl() {
        return this._customCannotAccessYourAccountUrl;
    }
    /**
     * Gets the customForgotMyPasswordText property value. A string to replace the default 'Forgot my password' hyperlink text on the sign-in form. This text must be in Unicode format and not exceed 256 characters.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomForgotMyPasswordText() {
        return this._customForgotMyPasswordText;
    }
    /**
     * Gets the customPrivacyAndCookiesText property value. A string to replace the default 'Privacy and Cookies' hyperlink text in the footer. This text must be in Unicode format and not exceed 256 characters.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomPrivacyAndCookiesText() {
        return this._customPrivacyAndCookiesText;
    }
    /**
     * Gets the customPrivacyAndCookiesUrl property value. A custom URL to replace the default URL of the 'Privacy and Cookies' hyperlink in the footer. This URL must be in ASCII format or non-ASCII characters must be URL encoded, and not exceed 128 characters.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomPrivacyAndCookiesUrl() {
        return this._customPrivacyAndCookiesUrl;
    }
    /**
     * Gets the customResetItNowText property value. A string to replace the default 'reset it now' hyperlink text on the sign-in form. This text must be in Unicode format and not exceed 256 characters. DO NOT USE: Customization of the 'reset it now' hyperlink text is currently not supported.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomResetItNowText() {
        return this._customResetItNowText;
    }
    /**
     * Gets the customTermsOfUseText property value. A string to replace the the default 'Terms of Use' hyperlink text in the footer. This text must be in Unicode format and not exceed 256 characters.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomTermsOfUseText() {
        return this._customTermsOfUseText;
    }
    /**
     * Gets the customTermsOfUseUrl property value. A custom URL to replace the default URL of the 'Terms of Use' hyperlink in the footer. This URL must be in ASCII format or non-ASCII characters must be URL encoded, and not exceed 128characters.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomTermsOfUseUrl() {
        return this._customTermsOfUseUrl;
    }
    /**
     * Gets the favicon property value. A custom icon (favicon) to replace a default Microsoft product favicon on an Azure AD tenant.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getFavicon() {
        return this._favicon;
    }
    /**
     * Gets the faviconRelativeUrl property value. A relative url for the favicon above that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFaviconRelativeUrl() {
        return this._faviconRelativeUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OrganizationalBrandingProperties currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("backgroundColor", (n) -> { currentObject.setBackgroundColor(n.getStringValue()); });
            this.put("backgroundImage", (n) -> { currentObject.setBackgroundImage(n.getByteArrayValue()); });
            this.put("backgroundImageRelativeUrl", (n) -> { currentObject.setBackgroundImageRelativeUrl(n.getStringValue()); });
            this.put("bannerLogo", (n) -> { currentObject.setBannerLogo(n.getByteArrayValue()); });
            this.put("bannerLogoRelativeUrl", (n) -> { currentObject.setBannerLogoRelativeUrl(n.getStringValue()); });
            this.put("cdnList", (n) -> { currentObject.setCdnList(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("customAccountResetCredentialsUrl", (n) -> { currentObject.setCustomAccountResetCredentialsUrl(n.getStringValue()); });
            this.put("customCannotAccessYourAccountText", (n) -> { currentObject.setCustomCannotAccessYourAccountText(n.getStringValue()); });
            this.put("customCannotAccessYourAccountUrl", (n) -> { currentObject.setCustomCannotAccessYourAccountUrl(n.getStringValue()); });
            this.put("customForgotMyPasswordText", (n) -> { currentObject.setCustomForgotMyPasswordText(n.getStringValue()); });
            this.put("customPrivacyAndCookiesText", (n) -> { currentObject.setCustomPrivacyAndCookiesText(n.getStringValue()); });
            this.put("customPrivacyAndCookiesUrl", (n) -> { currentObject.setCustomPrivacyAndCookiesUrl(n.getStringValue()); });
            this.put("customResetItNowText", (n) -> { currentObject.setCustomResetItNowText(n.getStringValue()); });
            this.put("customTermsOfUseText", (n) -> { currentObject.setCustomTermsOfUseText(n.getStringValue()); });
            this.put("customTermsOfUseUrl", (n) -> { currentObject.setCustomTermsOfUseUrl(n.getStringValue()); });
            this.put("favicon", (n) -> { currentObject.setFavicon(n.getByteArrayValue()); });
            this.put("faviconRelativeUrl", (n) -> { currentObject.setFaviconRelativeUrl(n.getStringValue()); });
            this.put("headerBackgroundColor", (n) -> { currentObject.setHeaderBackgroundColor(n.getStringValue()); });
            this.put("loginPageTextVisibilitySettings", (n) -> { currentObject.setLoginPageTextVisibilitySettings(n.getObjectValue(LoginPageTextVisibilitySettings::createFromDiscriminatorValue)); });
            this.put("signInPageText", (n) -> { currentObject.setSignInPageText(n.getStringValue()); });
            this.put("squareLogo", (n) -> { currentObject.setSquareLogo(n.getByteArrayValue()); });
            this.put("squareLogoDark", (n) -> { currentObject.setSquareLogoDark(n.getByteArrayValue()); });
            this.put("squareLogoDarkRelativeUrl", (n) -> { currentObject.setSquareLogoDarkRelativeUrl(n.getStringValue()); });
            this.put("squareLogoRelativeUrl", (n) -> { currentObject.setSquareLogoRelativeUrl(n.getStringValue()); });
            this.put("usernameHintText", (n) -> { currentObject.setUsernameHintText(n.getStringValue()); });
        }};
    }
    /**
     * Gets the headerBackgroundColor property value. The RGB color to apply to customize the color of the header.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHeaderBackgroundColor() {
        return this._headerBackgroundColor;
    }
    /**
     * Gets the loginPageTextVisibilitySettings property value. Represents the various texts that can be hidden on the login page for a tenant.
     * @return a loginPageTextVisibilitySettings
     */
    @javax.annotation.Nullable
    public LoginPageTextVisibilitySettings getLoginPageTextVisibilitySettings() {
        return this._loginPageTextVisibilitySettings;
    }
    /**
     * Gets the signInPageText property value. Text that appears at the bottom of the sign-in box. Use this to communicate additional information, such as the phone number to your help desk or a legal statement. This text must be in Unicode format and not exceed 1024 characters.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSignInPageText() {
        return this._signInPageText;
    }
    /**
     * Gets the squareLogo property value. A square version of your company logo that appears in Windows 10 out-of-box experiences (OOBE) and when Windows Autopilot is enabled for deployment. Allowed types are PNG or JPEG not larger than 240 x 240 pixels and not more than 10 KB in size. We recommend using a transparent image with no padding around the logo.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getSquareLogo() {
        return this._squareLogo;
    }
    /**
     * Gets the squareLogoDark property value. A square dark version of your company logo that appears in Windows 10 out-of-box experiences (OOBE) and when Windows Autopilot is enabled for deployment. Allowed types are PNG or JPEG not larger than 240 x 240 pixels and not more than 10 KB in size. We recommend using a transparent image with no padding around the logo.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getSquareLogoDark() {
        return this._squareLogoDark;
    }
    /**
     * Gets the squareLogoDarkRelativeUrl property value. A relative URL for the squareLogoDark property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSquareLogoDarkRelativeUrl() {
        return this._squareLogoDarkRelativeUrl;
    }
    /**
     * Gets the squareLogoRelativeUrl property value. A relative URL for the squareLogo property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSquareLogoRelativeUrl() {
        return this._squareLogoRelativeUrl;
    }
    /**
     * Gets the usernameHintText property value. A string that shows as the hint in the username textbox on the sign-in screen. This text must be a Unicode, without links or code, and can't exceed 64 characters.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUsernameHintText() {
        return this._usernameHintText;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("backgroundColor", this.getBackgroundColor());
        writer.writeByteArrayValue("backgroundImage", this.getBackgroundImage());
        writer.writeStringValue("backgroundImageRelativeUrl", this.getBackgroundImageRelativeUrl());
        writer.writeByteArrayValue("bannerLogo", this.getBannerLogo());
        writer.writeStringValue("bannerLogoRelativeUrl", this.getBannerLogoRelativeUrl());
        writer.writeCollectionOfPrimitiveValues("cdnList", this.getCdnList());
        writer.writeStringValue("customAccountResetCredentialsUrl", this.getCustomAccountResetCredentialsUrl());
        writer.writeStringValue("customCannotAccessYourAccountText", this.getCustomCannotAccessYourAccountText());
        writer.writeStringValue("customCannotAccessYourAccountUrl", this.getCustomCannotAccessYourAccountUrl());
        writer.writeStringValue("customForgotMyPasswordText", this.getCustomForgotMyPasswordText());
        writer.writeStringValue("customPrivacyAndCookiesText", this.getCustomPrivacyAndCookiesText());
        writer.writeStringValue("customPrivacyAndCookiesUrl", this.getCustomPrivacyAndCookiesUrl());
        writer.writeStringValue("customResetItNowText", this.getCustomResetItNowText());
        writer.writeStringValue("customTermsOfUseText", this.getCustomTermsOfUseText());
        writer.writeStringValue("customTermsOfUseUrl", this.getCustomTermsOfUseUrl());
        writer.writeByteArrayValue("favicon", this.getFavicon());
        writer.writeStringValue("faviconRelativeUrl", this.getFaviconRelativeUrl());
        writer.writeStringValue("headerBackgroundColor", this.getHeaderBackgroundColor());
        writer.writeObjectValue("loginPageTextVisibilitySettings", this.getLoginPageTextVisibilitySettings());
        writer.writeStringValue("signInPageText", this.getSignInPageText());
        writer.writeByteArrayValue("squareLogo", this.getSquareLogo());
        writer.writeByteArrayValue("squareLogoDark", this.getSquareLogoDark());
        writer.writeStringValue("squareLogoDarkRelativeUrl", this.getSquareLogoDarkRelativeUrl());
        writer.writeStringValue("squareLogoRelativeUrl", this.getSquareLogoRelativeUrl());
        writer.writeStringValue("usernameHintText", this.getUsernameHintText());
    }
    /**
     * Sets the backgroundColor property value. Color that appears in place of the background image in low-bandwidth connections. We recommend that you use the primary color of your banner logo or your organization color. Specify this in hexadecimal format, for example, white is #FFFFFF.
     * @param value Value to set for the backgroundColor property.
     * @return a void
     */
    public void setBackgroundColor(@javax.annotation.Nullable final String value) {
        this._backgroundColor = value;
    }
    /**
     * Sets the backgroundImage property value. Image that appears as the background of the sign-in page. The allowed types are PNG or JPEG not smaller than 300 KB and not larger than 1920  1080 pixels. A smaller image will reduce bandwidth requirements and make the page load faster.
     * @param value Value to set for the backgroundImage property.
     * @return a void
     */
    public void setBackgroundImage(@javax.annotation.Nullable final byte[] value) {
        this._backgroundImage = value;
    }
    /**
     * Sets the backgroundImageRelativeUrl property value. A relative URL for the backgroundImage property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only.
     * @param value Value to set for the backgroundImageRelativeUrl property.
     * @return a void
     */
    public void setBackgroundImageRelativeUrl(@javax.annotation.Nullable final String value) {
        this._backgroundImageRelativeUrl = value;
    }
    /**
     * Sets the bannerLogo property value. A banner version of your company logo that appears on the sign-in page. The allowed types are PNG or JPEG not larger than 36  245 pixels. We recommend using a transparent image with no padding around the logo.
     * @param value Value to set for the bannerLogo property.
     * @return a void
     */
    public void setBannerLogo(@javax.annotation.Nullable final byte[] value) {
        this._bannerLogo = value;
    }
    /**
     * Sets the bannerLogoRelativeUrl property value. A relative URL for the bannerLogo property that is combined with a CDN base URL from the cdnList to provide the read-only version served by a CDN. Read-only.
     * @param value Value to set for the bannerLogoRelativeUrl property.
     * @return a void
     */
    public void setBannerLogoRelativeUrl(@javax.annotation.Nullable final String value) {
        this._bannerLogoRelativeUrl = value;
    }
    /**
     * Sets the cdnList property value. A list of base URLs for all available CDN providers that are serving the assets of the current resource. Several CDN providers are used at the same time for high availability of read requests. Read-only.
     * @param value Value to set for the cdnList property.
     * @return a void
     */
    public void setCdnList(@javax.annotation.Nullable final java.util.List<String> value) {
        this._cdnList = value;
    }
    /**
     * Sets the customAccountResetCredentialsUrl property value. A custom URL for resetting account credentials. This URL must be in ASCII format or non-ASCII characters must be URL encoded, and not exceed 128 characters.
     * @param value Value to set for the customAccountResetCredentialsUrl property.
     * @return a void
     */
    public void setCustomAccountResetCredentialsUrl(@javax.annotation.Nullable final String value) {
        this._customAccountResetCredentialsUrl = value;
    }
    /**
     * Sets the customCannotAccessYourAccountText property value. A string to replace the default 'Can't access your account?' self-service password reset (SSPR) hyperlink text on the sign-in page. This text must be in Unicode format and not exceed 256 characters.
     * @param value Value to set for the customCannotAccessYourAccountText property.
     * @return a void
     */
    public void setCustomCannotAccessYourAccountText(@javax.annotation.Nullable final String value) {
        this._customCannotAccessYourAccountText = value;
    }
    /**
     * Sets the customCannotAccessYourAccountUrl property value. A custom URL to replace the default URL of the self-service password reset (SSPR) 'Can't access your account?' hyperlink on the sign-in page. This URL must be in ASCII format or non-ASCII characters must be URL encoded, and not exceed 128 characters. DO NOT USE. Use customAccountResetCredentialsUrl instead.
     * @param value Value to set for the customCannotAccessYourAccountUrl property.
     * @return a void
     */
    public void setCustomCannotAccessYourAccountUrl(@javax.annotation.Nullable final String value) {
        this._customCannotAccessYourAccountUrl = value;
    }
    /**
     * Sets the customForgotMyPasswordText property value. A string to replace the default 'Forgot my password' hyperlink text on the sign-in form. This text must be in Unicode format and not exceed 256 characters.
     * @param value Value to set for the customForgotMyPasswordText property.
     * @return a void
     */
    public void setCustomForgotMyPasswordText(@javax.annotation.Nullable final String value) {
        this._customForgotMyPasswordText = value;
    }
    /**
     * Sets the customPrivacyAndCookiesText property value. A string to replace the default 'Privacy and Cookies' hyperlink text in the footer. This text must be in Unicode format and not exceed 256 characters.
     * @param value Value to set for the customPrivacyAndCookiesText property.
     * @return a void
     */
    public void setCustomPrivacyAndCookiesText(@javax.annotation.Nullable final String value) {
        this._customPrivacyAndCookiesText = value;
    }
    /**
     * Sets the customPrivacyAndCookiesUrl property value. A custom URL to replace the default URL of the 'Privacy and Cookies' hyperlink in the footer. This URL must be in ASCII format or non-ASCII characters must be URL encoded, and not exceed 128 characters.
     * @param value Value to set for the customPrivacyAndCookiesUrl property.
     * @return a void
     */
    public void setCustomPrivacyAndCookiesUrl(@javax.annotation.Nullable final String value) {
        this._customPrivacyAndCookiesUrl = value;
    }
    /**
     * Sets the customResetItNowText property value. A string to replace the default 'reset it now' hyperlink text on the sign-in form. This text must be in Unicode format and not exceed 256 characters. DO NOT USE: Customization of the 'reset it now' hyperlink text is currently not supported.
     * @param value Value to set for the customResetItNowText property.
     * @return a void
     */
    public void setCustomResetItNowText(@javax.annotation.Nullable final String value) {
        this._customResetItNowText = value;
    }
    /**
     * Sets the customTermsOfUseText property value. A string to replace the the default 'Terms of Use' hyperlink text in the footer. This text must be in Unicode format and not exceed 256 characters.
     * @param value Value to set for the customTermsOfUseText property.
     * @return a void
     */
    public void setCustomTermsOfUseText(@javax.annotation.Nullable final String value) {
        this._customTermsOfUseText = value;
    }
    /**
     * Sets the customTermsOfUseUrl property value. A custom URL to replace the default URL of the 'Terms of Use' hyperlink in the footer. This URL must be in ASCII format or non-ASCII characters must be URL encoded, and not exceed 128characters.
     * @param value Value to set for the customTermsOfUseUrl property.
     * @return a void
     */
    public void setCustomTermsOfUseUrl(@javax.annotation.Nullable final String value) {
        this._customTermsOfUseUrl = value;
    }
    /**
     * Sets the favicon property value. A custom icon (favicon) to replace a default Microsoft product favicon on an Azure AD tenant.
     * @param value Value to set for the favicon property.
     * @return a void
     */
    public void setFavicon(@javax.annotation.Nullable final byte[] value) {
        this._favicon = value;
    }
    /**
     * Sets the faviconRelativeUrl property value. A relative url for the favicon above that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only.
     * @param value Value to set for the faviconRelativeUrl property.
     * @return a void
     */
    public void setFaviconRelativeUrl(@javax.annotation.Nullable final String value) {
        this._faviconRelativeUrl = value;
    }
    /**
     * Sets the headerBackgroundColor property value. The RGB color to apply to customize the color of the header.
     * @param value Value to set for the headerBackgroundColor property.
     * @return a void
     */
    public void setHeaderBackgroundColor(@javax.annotation.Nullable final String value) {
        this._headerBackgroundColor = value;
    }
    /**
     * Sets the loginPageTextVisibilitySettings property value. Represents the various texts that can be hidden on the login page for a tenant.
     * @param value Value to set for the loginPageTextVisibilitySettings property.
     * @return a void
     */
    public void setLoginPageTextVisibilitySettings(@javax.annotation.Nullable final LoginPageTextVisibilitySettings value) {
        this._loginPageTextVisibilitySettings = value;
    }
    /**
     * Sets the signInPageText property value. Text that appears at the bottom of the sign-in box. Use this to communicate additional information, such as the phone number to your help desk or a legal statement. This text must be in Unicode format and not exceed 1024 characters.
     * @param value Value to set for the signInPageText property.
     * @return a void
     */
    public void setSignInPageText(@javax.annotation.Nullable final String value) {
        this._signInPageText = value;
    }
    /**
     * Sets the squareLogo property value. A square version of your company logo that appears in Windows 10 out-of-box experiences (OOBE) and when Windows Autopilot is enabled for deployment. Allowed types are PNG or JPEG not larger than 240 x 240 pixels and not more than 10 KB in size. We recommend using a transparent image with no padding around the logo.
     * @param value Value to set for the squareLogo property.
     * @return a void
     */
    public void setSquareLogo(@javax.annotation.Nullable final byte[] value) {
        this._squareLogo = value;
    }
    /**
     * Sets the squareLogoDark property value. A square dark version of your company logo that appears in Windows 10 out-of-box experiences (OOBE) and when Windows Autopilot is enabled for deployment. Allowed types are PNG or JPEG not larger than 240 x 240 pixels and not more than 10 KB in size. We recommend using a transparent image with no padding around the logo.
     * @param value Value to set for the squareLogoDark property.
     * @return a void
     */
    public void setSquareLogoDark(@javax.annotation.Nullable final byte[] value) {
        this._squareLogoDark = value;
    }
    /**
     * Sets the squareLogoDarkRelativeUrl property value. A relative URL for the squareLogoDark property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only.
     * @param value Value to set for the squareLogoDarkRelativeUrl property.
     * @return a void
     */
    public void setSquareLogoDarkRelativeUrl(@javax.annotation.Nullable final String value) {
        this._squareLogoDarkRelativeUrl = value;
    }
    /**
     * Sets the squareLogoRelativeUrl property value. A relative URL for the squareLogo property that is combined with a CDN base URL from the cdnList to provide the version served by a CDN. Read-only.
     * @param value Value to set for the squareLogoRelativeUrl property.
     * @return a void
     */
    public void setSquareLogoRelativeUrl(@javax.annotation.Nullable final String value) {
        this._squareLogoRelativeUrl = value;
    }
    /**
     * Sets the usernameHintText property value. A string that shows as the hint in the username textbox on the sign-in screen. This text must be a Unicode, without links or code, and can't exceed 64 characters.
     * @param value Value to set for the usernameHintText property.
     * @return a void
     */
    public void setUsernameHintText(@javax.annotation.Nullable final String value) {
        this._usernameHintText = value;
    }
}
