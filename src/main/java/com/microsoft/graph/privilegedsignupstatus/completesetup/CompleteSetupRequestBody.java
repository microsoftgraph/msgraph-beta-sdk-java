package microsoft.graph.privilegedsignupstatus.completesetup;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.TenantSetupInfo;
/** Provides operations to call the completeSetup method. */
public class CompleteSetupRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The tenantSetupInfo property */
    private TenantSetupInfo _tenantSetupInfo;
    /**
     * Instantiates a new completeSetupRequestBody and sets the default values.
     * @return a void
     */
    public CompleteSetupRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a completeSetupRequestBody
     */
    @javax.annotation.Nonnull
    public static CompleteSetupRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CompleteSetupRequestBody();
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
        final CompleteSetupRequestBody currentObject = this;
        return new HashMap<>(1) {{
            this.put("tenantSetupInfo", (n) -> { currentObject.setTenantSetupInfo(n.getObjectValue(TenantSetupInfo::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the tenantSetupInfo property value. The tenantSetupInfo property
     * @return a tenantSetupInfo
     */
    @javax.annotation.Nullable
    public TenantSetupInfo getTenantSetupInfo() {
        return this._tenantSetupInfo;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("tenantSetupInfo", this.getTenantSetupInfo());
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
     * Sets the tenantSetupInfo property value. The tenantSetupInfo property
     * @param value Value to set for the tenantSetupInfo property.
     * @return a void
     */
    public void setTenantSetupInfo(@javax.annotation.Nullable final TenantSetupInfo value) {
        this._tenantSetupInfo = value;
    }
}
