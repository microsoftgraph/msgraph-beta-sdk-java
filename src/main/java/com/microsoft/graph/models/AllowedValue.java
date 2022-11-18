package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class AllowedValue extends Entity implements Parsable {
    /** Indicates whether the predefined value is active or deactivated. If set to false, this predefined value cannot be assigned to any additional supported directory objects. */
    private Boolean _isActive;
    /**
     * Instantiates a new allowedValue and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AllowedValue() {
        super();
        this.setOdataType("#microsoft.graph.allowedValue");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a allowedValue
     */
    @javax.annotation.Nonnull
    public static AllowedValue createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AllowedValue();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AllowedValue currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("isActive", (n) -> { currentObject.setIsActive(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the isActive property value. Indicates whether the predefined value is active or deactivated. If set to false, this predefined value cannot be assigned to any additional supported directory objects.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsActive() {
        return this._isActive;
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
        writer.writeBooleanValue("isActive", this.getIsActive());
    }
    /**
     * Sets the isActive property value. Indicates whether the predefined value is active or deactivated. If set to false, this predefined value cannot be assigned to any additional supported directory objects.
     * @param value Value to set for the isActive property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsActive(@javax.annotation.Nullable final Boolean value) {
        this._isActive = value;
    }
}
