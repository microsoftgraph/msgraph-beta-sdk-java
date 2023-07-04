package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AttackSimulationOperation extends LongRunningOperation implements Parsable {
    /**
     * Percentage of completion of the respective operation.
     */
    private Integer percentageCompleted;
    /**
     * Tenant identifier.
     */
    private String tenantId;
    /**
     * The attack simulation operation type. Possible values are: createSimulation, updateSimulation, unknownFutureValue.
     */
    private AttackSimulationOperationType type;
    /**
     * Instantiates a new AttackSimulationOperation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AttackSimulationOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AttackSimulationOperation
     */
    @javax.annotation.Nonnull
    public static AttackSimulationOperation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttackSimulationOperation();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("percentageCompleted", (n) -> { this.setPercentageCompleted(n.getIntegerValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(AttackSimulationOperationType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the percentageCompleted property value. Percentage of completion of the respective operation.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPercentageCompleted() {
        return this.percentageCompleted;
    }
    /**
     * Gets the tenantId property value. Tenant identifier.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Gets the type property value. The attack simulation operation type. Possible values are: createSimulation, updateSimulation, unknownFutureValue.
     * @return a attackSimulationOperationType
     */
    @javax.annotation.Nullable
    public AttackSimulationOperationType getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("percentageCompleted", this.getPercentageCompleted());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeEnumValue("type", this.getType());
    }
    /**
     * Sets the percentageCompleted property value. Percentage of completion of the respective operation.
     * @param value Value to set for the percentageCompleted property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPercentageCompleted(@javax.annotation.Nullable final Integer value) {
        this.percentageCompleted = value;
    }
    /**
     * Sets the tenantId property value. Tenant identifier.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this.tenantId = value;
    }
    /**
     * Sets the type property value. The attack simulation operation type. Possible values are: createSimulation, updateSimulation, unknownFutureValue.
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final AttackSimulationOperationType value) {
        this.type = value;
    }
}
