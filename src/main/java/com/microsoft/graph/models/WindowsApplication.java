package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsApplication implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The package security identifier that Microsoft has assigned the application. Optional. Read-only.  */
    private String _packageSid;
    /** Specifies the URLs where user tokens are sent for sign-in or the redirect URIs where OAuth 2.0 authorization codes and access tokens are sent. Only available for applications that support the PersonalMicrosoftAccount signInAudience.  */
    private java.util.List<String> _redirectUris;
    /**
     * Instantiates a new windowsApplication and sets the default values.
     * @return a void
     */
    public WindowsApplication() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsApplication
     */
    @javax.annotation.Nonnull
    public static WindowsApplication createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsApplication();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsApplication currentObject = this;
        return new HashMap<>(2) {{
            this.put("packageSid", (n) -> { currentObject.setPackageSid(n.getStringValue()); });
            this.put("redirectUris", (n) -> { currentObject.setRedirectUris(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the packageSid property value. The package security identifier that Microsoft has assigned the application. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPackageSid() {
        return this._packageSid;
    }
    /**
     * Gets the redirectUris property value. Specifies the URLs where user tokens are sent for sign-in or the redirect URIs where OAuth 2.0 authorization codes and access tokens are sent. Only available for applications that support the PersonalMicrosoftAccount signInAudience.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRedirectUris() {
        return this._redirectUris;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("packageSid", this.getPackageSid());
        writer.writeCollectionOfPrimitiveValues("redirectUris", this.getRedirectUris());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the packageSid property value. The package security identifier that Microsoft has assigned the application. Optional. Read-only.
     * @param value Value to set for the packageSid property.
     * @return a void
     */
    public void setPackageSid(@javax.annotation.Nullable final String value) {
        this._packageSid = value;
    }
    /**
     * Sets the redirectUris property value. Specifies the URLs where user tokens are sent for sign-in or the redirect URIs where OAuth 2.0 authorization codes and access tokens are sent. Only available for applications that support the PersonalMicrosoftAccount signInAudience.
     * @param value Value to set for the redirectUris property.
     * @return a void
     */
    public void setRedirectUris(@javax.annotation.Nullable final java.util.List<String> value) {
        this._redirectUris = value;
    }
}
