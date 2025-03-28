package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkbookChartGridlines extends Entity implements Parsable {
    /**
     * Instantiates a new {@link WorkbookChartGridlines} and sets the default values.
     */
    public WorkbookChartGridlines() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WorkbookChartGridlines}
     */
    @jakarta.annotation.Nonnull
    public static WorkbookChartGridlines createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookChartGridlines();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("format", (n) -> { this.setFormat(n.getObjectValue(WorkbookChartGridlinesFormat::createFromDiscriminatorValue)); });
        deserializerMap.put("visible", (n) -> { this.setVisible(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the format property value. Represents the formatting of chart gridlines. Read-only.
     * @return a {@link WorkbookChartGridlinesFormat}
     */
    @jakarta.annotation.Nullable
    public WorkbookChartGridlinesFormat getFormat() {
        return this.backingStore.get("format");
    }
    /**
     * Gets the visible property value. Indicates whether the axis gridlines are visible.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getVisible() {
        return this.backingStore.get("visible");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("format", this.getFormat());
        writer.writeBooleanValue("visible", this.getVisible());
    }
    /**
     * Sets the format property value. Represents the formatting of chart gridlines. Read-only.
     * @param value Value to set for the format property.
     */
    public void setFormat(@jakarta.annotation.Nullable final WorkbookChartGridlinesFormat value) {
        this.backingStore.set("format", value);
    }
    /**
     * Sets the visible property value. Indicates whether the axis gridlines are visible.
     * @param value Value to set for the visible property.
     */
    public void setVisible(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("visible", value);
    }
}
