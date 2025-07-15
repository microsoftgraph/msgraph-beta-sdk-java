package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IncidentTaskResponseAction extends ResponseAction implements Parsable {
    /**
     * Instantiates a new {@link IncidentTaskResponseAction} and sets the default values.
     */
    public IncidentTaskResponseAction() {
        super();
        this.setOdataType("#microsoft.graph.security.incidentTaskResponseAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IncidentTaskResponseAction}
     */
    @jakarta.annotation.Nonnull
    public static IncidentTaskResponseAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.security.collectInvestigationPackageIncidentTaskResponseAction": return new CollectInvestigationPackageIncidentTaskResponseAction();
                case "#microsoft.graph.security.disableUserIncidentTaskResponseAction": return new DisableUserIncidentTaskResponseAction();
                case "#microsoft.graph.security.enableUserIncidentTaskResponseAction": return new EnableUserIncidentTaskResponseAction();
                case "#microsoft.graph.security.forceUserPasswordResetIncidentTaskResponseAction": return new ForceUserPasswordResetIncidentTaskResponseAction();
                case "#microsoft.graph.security.hardDeleteEmailIncidentTaskResponseAction": return new HardDeleteEmailIncidentTaskResponseAction();
                case "#microsoft.graph.security.isolateDeviceIncidentTaskResponseAction": return new IsolateDeviceIncidentTaskResponseAction();
                case "#microsoft.graph.security.markUserAsCompromisedIncidentTaskResponseAction": return new MarkUserAsCompromisedIncidentTaskResponseAction();
                case "#microsoft.graph.security.requireSignInIncidentTaskResponseAction": return new RequireSignInIncidentTaskResponseAction();
                case "#microsoft.graph.security.restrictAppExecutionIncidentTaskResponseAction": return new RestrictAppExecutionIncidentTaskResponseAction();
                case "#microsoft.graph.security.runAntivirusScanIncidentTaskResponseAction": return new RunAntivirusScanIncidentTaskResponseAction();
                case "#microsoft.graph.security.softDeleteIncidentTaskResponseAction": return new SoftDeleteIncidentTaskResponseAction();
                case "#microsoft.graph.security.stopAndQuarantineFileIncidentTaskResponseAction": return new StopAndQuarantineFileIncidentTaskResponseAction();
                case "#microsoft.graph.security.unIsolateDeviceIncidentTaskResponseAction": return new UnIsolateDeviceIncidentTaskResponseAction();
                case "#microsoft.graph.security.unRestrictAppExecutionIncidentTaskResponseAction": return new UnRestrictAppExecutionIncidentTaskResponseAction();
            }
        }
        return new IncidentTaskResponseAction();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("identifierValue", (n) -> { this.setIdentifierValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the identifierValue property value. The identifierValue property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIdentifierValue() {
        return this.backingStore.get("identifierValue");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("identifierValue", this.getIdentifierValue());
    }
    /**
     * Sets the identifierValue property value. The identifierValue property
     * @param value Value to set for the identifierValue property.
     */
    public void setIdentifierValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("identifierValue", value);
    }
}
