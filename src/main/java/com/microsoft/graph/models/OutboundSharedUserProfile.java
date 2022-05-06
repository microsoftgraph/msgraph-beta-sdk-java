package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OutboundSharedUserProfile implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The tenants property  */
    private java.util.List<TenantReference> _tenants;
    /** The userId property  */
    private String _userId;
    /**
     * Instantiates a new outboundSharedUserProfile and sets the default values.
     * @return a void
     */
    public OutboundSharedUserProfile() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a outboundSharedUserProfile
     */
    @javax.annotation.Nonnull
    public static OutboundSharedUserProfile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OutboundSharedUserProfile();
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
        final OutboundSharedUserProfile currentObject = this;
        return new HashMap<>(2) {{
            this.put("tenants", (n) -> { currentObject.setTenants(n.getCollectionOfObjectValues(TenantReference::createFromDiscriminatorValue)); });
            this.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the tenants property value. The tenants property
     * @return a tenantReference
     */
    @javax.annotation.Nullable
    public java.util.List<TenantReference> getTenants() {
        return this._tenants;
    }
    /**
     * Gets the userId property value. The userId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this._userId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("tenants", this.getTenants());
        writer.writeStringValue("userId", this.getUserId());
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
     * Sets the tenants property value. The tenants property
     * @param value Value to set for the tenants property.
     * @return a void
     */
    public void setTenants(@javax.annotation.Nullable final java.util.List<TenantReference> value) {
        this._tenants = value;
    }
    /**
     * Sets the userId property value. The userId property
     * @param value Value to set for the userId property.
     * @return a void
     */
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
}
