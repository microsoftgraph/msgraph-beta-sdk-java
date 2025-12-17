package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InsiderRiskyUserApproval extends ControlConfiguration implements Parsable {
    /**
     * Instantiates a new {@link InsiderRiskyUserApproval} and sets the default values.
     */
    public InsiderRiskyUserApproval() {
        super();
        this.setOdataType("#microsoft.graph.insiderRiskyUserApproval");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link InsiderRiskyUserApproval}
     */
    @jakarta.annotation.Nonnull
    public static InsiderRiskyUserApproval createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InsiderRiskyUserApproval();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isApprovalRequired", (n) -> { this.setIsApprovalRequired(n.getBooleanValue()); });
        deserializerMap.put("minimumRiskLevel", (n) -> { this.setMinimumRiskLevel(n.getEnumValue(PurviewInsiderRiskManagementLevel::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isApprovalRequired property value. Indicates whether approval is required for risky users.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsApprovalRequired() {
        return this.backingStore.get("isApprovalRequired");
    }
    /**
     * Gets the minimumRiskLevel property value. The minimumRiskLevel property
     * @return a {@link PurviewInsiderRiskManagementLevel}
     */
    @jakarta.annotation.Nullable
    public PurviewInsiderRiskManagementLevel getMinimumRiskLevel() {
        return this.backingStore.get("minimumRiskLevel");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isApprovalRequired", this.getIsApprovalRequired());
        writer.writeEnumValue("minimumRiskLevel", this.getMinimumRiskLevel());
    }
    /**
     * Sets the isApprovalRequired property value. Indicates whether approval is required for risky users.
     * @param value Value to set for the isApprovalRequired property.
     */
    public void setIsApprovalRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isApprovalRequired", value);
    }
    /**
     * Sets the minimumRiskLevel property value. The minimumRiskLevel property
     * @param value Value to set for the minimumRiskLevel property.
     */
    public void setMinimumRiskLevel(@jakarta.annotation.Nullable final PurviewInsiderRiskManagementLevel value) {
        this.backingStore.set("minimumRiskLevel", value);
    }
}
