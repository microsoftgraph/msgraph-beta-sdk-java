package microsoft.graph.devicemanagement.androidmanagedstoreaccountenterprisesettings.approveapps;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the approveApps method.  */
public class ApproveAppsRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The approveAllPermissions property  */
    private Boolean _approveAllPermissions;
    /** The packageIds property  */
    private java.util.List<String> _packageIds;
    /**
     * Instantiates a new approveAppsRequestBody and sets the default values.
     * @return a void
     */
    public ApproveAppsRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a approveAppsRequestBody
     */
    @javax.annotation.Nonnull
    public static ApproveAppsRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApproveAppsRequestBody();
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
     * Gets the approveAllPermissions property value. The approveAllPermissions property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApproveAllPermissions() {
        return this._approveAllPermissions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ApproveAppsRequestBody currentObject = this;
        return new HashMap<>(2) {{
            this.put("approveAllPermissions", (n) -> { currentObject.setApproveAllPermissions(n.getBooleanValue()); });
            this.put("packageIds", (n) -> { currentObject.setPackageIds(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the packageIds property value. The packageIds property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getPackageIds() {
        return this._packageIds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("approveAllPermissions", this.getApproveAllPermissions());
        writer.writeCollectionOfPrimitiveValues("packageIds", this.getPackageIds());
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
     * Sets the approveAllPermissions property value. The approveAllPermissions property
     * @param value Value to set for the approveAllPermissions property.
     * @return a void
     */
    public void setApproveAllPermissions(@javax.annotation.Nullable final Boolean value) {
        this._approveAllPermissions = value;
    }
    /**
     * Sets the packageIds property value. The packageIds property
     * @param value Value to set for the packageIds property.
     * @return a void
     */
    public void setPackageIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._packageIds = value;
    }
}
