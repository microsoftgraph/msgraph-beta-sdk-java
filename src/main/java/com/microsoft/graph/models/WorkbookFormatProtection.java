package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookFormatProtection extends Entity implements Parsable {
    /**
     * The formulaHidden property
     */
    private Boolean formulaHidden;
    /**
     * The locked property
     */
    private Boolean locked;
    /**
     * Instantiates a new workbookFormatProtection and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public WorkbookFormatProtection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookFormatProtection
     */
    @jakarta.annotation.Nonnull
    public static WorkbookFormatProtection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookFormatProtection();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("formulaHidden", (n) -> { this.setFormulaHidden(n.getBooleanValue()); });
        deserializerMap.put("locked", (n) -> { this.setLocked(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the formulaHidden property value. The formulaHidden property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFormulaHidden() {
        return this.formulaHidden;
    }
    /**
     * Gets the locked property value. The locked property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLocked() {
        return this.locked;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("formulaHidden", this.getFormulaHidden());
        writer.writeBooleanValue("locked", this.getLocked());
    }
    /**
     * Sets the formulaHidden property value. The formulaHidden property
     * @param value Value to set for the formulaHidden property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFormulaHidden(@jakarta.annotation.Nullable final Boolean value) {
        this.formulaHidden = value;
    }
    /**
     * Sets the locked property value. The locked property
     * @param value Value to set for the locked property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLocked(@jakarta.annotation.Nullable final Boolean value) {
        this.locked = value;
    }
}
