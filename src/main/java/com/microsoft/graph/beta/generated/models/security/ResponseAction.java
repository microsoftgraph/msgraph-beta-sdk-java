package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ResponseAction implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ResponseAction} and sets the default values.
     */
    public ResponseAction() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ResponseAction}
     */
    @jakarta.annotation.Nonnull
    public static ResponseAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.security.allowFileResponseAction": return new AllowFileResponseAction();
                case "#microsoft.graph.security.blockFileResponseAction": return new BlockFileResponseAction();
                case "#microsoft.graph.security.collectInvestigationPackageIncidentTaskResponseAction": return new CollectInvestigationPackageIncidentTaskResponseAction();
                case "#microsoft.graph.security.collectInvestigationPackageResponseAction": return new CollectInvestigationPackageResponseAction();
                case "#microsoft.graph.security.disableUserIncidentTaskResponseAction": return new DisableUserIncidentTaskResponseAction();
                case "#microsoft.graph.security.disableUserResponseAction": return new DisableUserResponseAction();
                case "#microsoft.graph.security.enableUserIncidentTaskResponseAction": return new EnableUserIncidentTaskResponseAction();
                case "#microsoft.graph.security.forceUserPasswordResetIncidentTaskResponseAction": return new ForceUserPasswordResetIncidentTaskResponseAction();
                case "#microsoft.graph.security.forceUserPasswordResetResponseAction": return new ForceUserPasswordResetResponseAction();
                case "#microsoft.graph.security.hardDeleteEmailIncidentTaskResponseAction": return new HardDeleteEmailIncidentTaskResponseAction();
                case "#microsoft.graph.security.hardDeleteResponseAction": return new HardDeleteResponseAction();
                case "#microsoft.graph.security.incidentTaskResponseAction": return new IncidentTaskResponseAction();
                case "#microsoft.graph.security.initiateInvestigationResponseAction": return new InitiateInvestigationResponseAction();
                case "#microsoft.graph.security.isolateDeviceIncidentTaskResponseAction": return new IsolateDeviceIncidentTaskResponseAction();
                case "#microsoft.graph.security.isolateDeviceResponseAction": return new IsolateDeviceResponseAction();
                case "#microsoft.graph.security.markUserAsCompromisedIncidentTaskResponseAction": return new MarkUserAsCompromisedIncidentTaskResponseAction();
                case "#microsoft.graph.security.markUserAsCompromisedResponseAction": return new MarkUserAsCompromisedResponseAction();
                case "#microsoft.graph.security.moveToDeletedItemsResponseAction": return new MoveToDeletedItemsResponseAction();
                case "#microsoft.graph.security.moveToInboxResponseAction": return new MoveToInboxResponseAction();
                case "#microsoft.graph.security.moveToJunkResponseAction": return new MoveToJunkResponseAction();
                case "#microsoft.graph.security.requireSignInIncidentTaskResponseAction": return new RequireSignInIncidentTaskResponseAction();
                case "#microsoft.graph.security.restrictAppExecutionIncidentTaskResponseAction": return new RestrictAppExecutionIncidentTaskResponseAction();
                case "#microsoft.graph.security.restrictAppExecutionResponseAction": return new RestrictAppExecutionResponseAction();
                case "#microsoft.graph.security.runAntivirusScanIncidentTaskResponseAction": return new RunAntivirusScanIncidentTaskResponseAction();
                case "#microsoft.graph.security.runAntivirusScanResponseAction": return new RunAntivirusScanResponseAction();
                case "#microsoft.graph.security.softDeleteIncidentTaskResponseAction": return new SoftDeleteIncidentTaskResponseAction();
                case "#microsoft.graph.security.softDeleteResponseAction": return new SoftDeleteResponseAction();
                case "#microsoft.graph.security.stopAndQuarantineFileIncidentTaskResponseAction": return new StopAndQuarantineFileIncidentTaskResponseAction();
                case "#microsoft.graph.security.stopAndQuarantineFileResponseAction": return new StopAndQuarantineFileResponseAction();
                case "#microsoft.graph.security.unIsolateDeviceIncidentTaskResponseAction": return new UnIsolateDeviceIncidentTaskResponseAction();
                case "#microsoft.graph.security.unRestrictAppExecutionIncidentTaskResponseAction": return new UnRestrictAppExecutionIncidentTaskResponseAction();
            }
        }
        return new ResponseAction();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
