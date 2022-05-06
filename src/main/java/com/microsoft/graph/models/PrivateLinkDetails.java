package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrivateLinkDetails implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The unique identifier for the Private Link policy.  */
    private String _policyId;
    /** The name of the Private Link policy in Azure AD.  */
    private String _policyName;
    /** The tenant identifier of the Azure AD tenant the Private Link policy belongs to.  */
    private String _policyTenantId;
    /** The Azure Resource Manager (ARM) path for the Private Link policy resource.  */
    private String _resourceId;
    /**
     * Instantiates a new privateLinkDetails and sets the default values.
     * @return a void
     */
    public PrivateLinkDetails() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a privateLinkDetails
     */
    @javax.annotation.Nonnull
    public static PrivateLinkDetails createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivateLinkDetails();
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
        final PrivateLinkDetails currentObject = this;
        return new HashMap<>(4) {{
            this.put("policyId", (n) -> { currentObject.setPolicyId(n.getStringValue()); });
            this.put("policyName", (n) -> { currentObject.setPolicyName(n.getStringValue()); });
            this.put("policyTenantId", (n) -> { currentObject.setPolicyTenantId(n.getStringValue()); });
            this.put("resourceId", (n) -> { currentObject.setResourceId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the policyId property value. The unique identifier for the Private Link policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPolicyId() {
        return this._policyId;
    }
    /**
     * Gets the policyName property value. The name of the Private Link policy in Azure AD.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPolicyName() {
        return this._policyName;
    }
    /**
     * Gets the policyTenantId property value. The tenant identifier of the Azure AD tenant the Private Link policy belongs to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPolicyTenantId() {
        return this._policyTenantId;
    }
    /**
     * Gets the resourceId property value. The Azure Resource Manager (ARM) path for the Private Link policy resource.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceId() {
        return this._resourceId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("policyId", this.getPolicyId());
        writer.writeStringValue("policyName", this.getPolicyName());
        writer.writeStringValue("policyTenantId", this.getPolicyTenantId());
        writer.writeStringValue("resourceId", this.getResourceId());
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
     * Sets the policyId property value. The unique identifier for the Private Link policy.
     * @param value Value to set for the policyId property.
     * @return a void
     */
    public void setPolicyId(@javax.annotation.Nullable final String value) {
        this._policyId = value;
    }
    /**
     * Sets the policyName property value. The name of the Private Link policy in Azure AD.
     * @param value Value to set for the policyName property.
     * @return a void
     */
    public void setPolicyName(@javax.annotation.Nullable final String value) {
        this._policyName = value;
    }
    /**
     * Sets the policyTenantId property value. The tenant identifier of the Azure AD tenant the Private Link policy belongs to.
     * @param value Value to set for the policyTenantId property.
     * @return a void
     */
    public void setPolicyTenantId(@javax.annotation.Nullable final String value) {
        this._policyTenantId = value;
    }
    /**
     * Sets the resourceId property value. The Azure Resource Manager (ARM) path for the Private Link policy resource.
     * @param value Value to set for the resourceId property.
     * @return a void
     */
    public void setResourceId(@javax.annotation.Nullable final String value) {
        this._resourceId = value;
    }
}
