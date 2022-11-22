package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PlannerBucketPropertyRule extends PlannerPropertyRule implements Parsable {
    /** The order property */
    private java.util.List<String> _order;
    /** The title property */
    private java.util.List<String> _title;
    /**
     * Instantiates a new PlannerBucketPropertyRule and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PlannerBucketPropertyRule() {
        super();
        this.setOdataType("#microsoft.graph.plannerBucketPropertyRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PlannerBucketPropertyRule
     */
    @javax.annotation.Nonnull
    public static PlannerBucketPropertyRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerBucketPropertyRule();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("order", (n) -> { this.setOrder(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the order property value. The order property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getOrder() {
        return this._order;
    }
    /**
     * Gets the title property value. The title property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTitle() {
        return this._title;
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
        writer.writeCollectionOfPrimitiveValues("order", this.getOrder());
        writer.writeCollectionOfPrimitiveValues("title", this.getTitle());
    }
    /**
     * Sets the order property value. The order property
     * @param value Value to set for the order property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrder(@javax.annotation.Nullable final java.util.List<String> value) {
        this._order = value;
    }
    /**
     * Sets the title property value. The title property
     * @param value Value to set for the title property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTitle(@javax.annotation.Nullable final java.util.List<String> value) {
        this._title = value;
    }
}
