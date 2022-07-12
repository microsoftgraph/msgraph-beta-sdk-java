package microsoft.graph.devicemanagement.chromeosonboardingsettings.connect;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the connect method. */
public class ChromeOSOnboardingStatusPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The ownerAccessToken property */
    private String _ownerAccessToken;
    /** The ownerUserPrincipalName property */
    private String _ownerUserPrincipalName;
    /**
     * Instantiates a new ChromeOSOnboardingStatusPostRequestBody and sets the default values.
     * @return a void
     */
    public ChromeOSOnboardingStatusPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ChromeOSOnboardingStatusPostRequestBody
     */
    @javax.annotation.Nonnull
    public static ChromeOSOnboardingStatusPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChromeOSOnboardingStatusPostRequestBody();
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
        final ChromeOSOnboardingStatusPostRequestBody currentObject = this;
        return new HashMap<>(2) {{
            this.put("ownerAccessToken", (n) -> { currentObject.setOwnerAccessToken(n.getStringValue()); });
            this.put("ownerUserPrincipalName", (n) -> { currentObject.setOwnerUserPrincipalName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the ownerAccessToken property value. The ownerAccessToken property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOwnerAccessToken() {
        return this._ownerAccessToken;
    }
    /**
     * Gets the ownerUserPrincipalName property value. The ownerUserPrincipalName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOwnerUserPrincipalName() {
        return this._ownerUserPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("ownerAccessToken", this.getOwnerAccessToken());
        writer.writeStringValue("ownerUserPrincipalName", this.getOwnerUserPrincipalName());
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
     * Sets the ownerAccessToken property value. The ownerAccessToken property
     * @param value Value to set for the ownerAccessToken property.
     * @return a void
     */
    public void setOwnerAccessToken(@javax.annotation.Nullable final String value) {
        this._ownerAccessToken = value;
    }
    /**
     * Sets the ownerUserPrincipalName property value. The ownerUserPrincipalName property
     * @param value Value to set for the ownerUserPrincipalName property.
     * @return a void
     */
    public void setOwnerUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._ownerUserPrincipalName = value;
    }
}
