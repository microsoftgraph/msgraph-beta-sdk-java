package microsoft.graph.devicemanagement.compliancepolicies.item.setscheduledactions;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.DeviceManagementComplianceScheduledActionForRule;
/** Provides operations to call the setScheduledActions method.  */
public class SetScheduledActionsRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The scheduledActions property  */
    private java.util.List<DeviceManagementComplianceScheduledActionForRule> _scheduledActions;
    /**
     * Instantiates a new setScheduledActionsRequestBody and sets the default values.
     * @return a void
     */
    public SetScheduledActionsRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a setScheduledActionsRequestBody
     */
    @javax.annotation.Nonnull
    public static SetScheduledActionsRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SetScheduledActionsRequestBody();
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
        final SetScheduledActionsRequestBody currentObject = this;
        return new HashMap<>(1) {{
            this.put("scheduledActions", (n) -> { currentObject.setScheduledActions(n.getCollectionOfObjectValues(DeviceManagementComplianceScheduledActionForRule::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the scheduledActions property value. The scheduledActions property
     * @return a deviceManagementComplianceScheduledActionForRule
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementComplianceScheduledActionForRule> getScheduledActions() {
        return this._scheduledActions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("scheduledActions", this.getScheduledActions());
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
     * Sets the scheduledActions property value. The scheduledActions property
     * @param value Value to set for the scheduledActions property.
     * @return a void
     */
    public void setScheduledActions(@javax.annotation.Nullable final java.util.List<DeviceManagementComplianceScheduledActionForRule> value) {
        this._scheduledActions = value;
    }
}
