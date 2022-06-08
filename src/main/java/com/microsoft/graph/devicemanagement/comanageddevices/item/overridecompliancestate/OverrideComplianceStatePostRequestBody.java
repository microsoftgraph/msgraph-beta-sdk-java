package microsoft.graph.devicemanagement.comanageddevices.item.overridecompliancestate;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.AdministratorConfiguredDeviceComplianceState;
/** Provides operations to call the overrideComplianceState method. */
public class OverrideComplianceStatePostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The complianceState property */
    private AdministratorConfiguredDeviceComplianceState _complianceState;
    /** The remediationUrl property */
    private String _remediationUrl;
    /**
     * Instantiates a new overrideComplianceStatePostRequestBody and sets the default values.
     * @return a void
     */
    public OverrideComplianceStatePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a overrideComplianceStatePostRequestBody
     */
    @javax.annotation.Nonnull
    public static OverrideComplianceStatePostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OverrideComplianceStatePostRequestBody();
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
     * Gets the complianceState property value. The complianceState property
     * @return a administratorConfiguredDeviceComplianceState
     */
    @javax.annotation.Nullable
    public AdministratorConfiguredDeviceComplianceState getComplianceState() {
        return this._complianceState;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OverrideComplianceStatePostRequestBody currentObject = this;
        return new HashMap<>(2) {{
            this.put("complianceState", (n) -> { currentObject.setComplianceState(n.getEnumValue(AdministratorConfiguredDeviceComplianceState.class)); });
            this.put("remediationUrl", (n) -> { currentObject.setRemediationUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the remediationUrl property value. The remediationUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRemediationUrl() {
        return this._remediationUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("complianceState", this.getComplianceState());
        writer.writeStringValue("remediationUrl", this.getRemediationUrl());
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
     * Sets the complianceState property value. The complianceState property
     * @param value Value to set for the complianceState property.
     * @return a void
     */
    public void setComplianceState(@javax.annotation.Nullable final AdministratorConfiguredDeviceComplianceState value) {
        this._complianceState = value;
    }
    /**
     * Sets the remediationUrl property value. The remediationUrl property
     * @param value Value to set for the remediationUrl property.
     * @return a void
     */
    public void setRemediationUrl(@javax.annotation.Nullable final String value) {
        this._remediationUrl = value;
    }
}
