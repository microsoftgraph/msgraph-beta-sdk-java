package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookFilter extends Entity implements Parsable {
    /**
     * The criteria property
     */
    private WorkbookFilterCriteria criteria;
    /**
     * Instantiates a new workbookFilter and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public WorkbookFilter() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookFilter
     */
    @jakarta.annotation.Nonnull
    public static WorkbookFilter createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookFilter();
    }
    /**
     * Gets the criteria property value. The criteria property
     * @return a workbookFilterCriteria
     */
    @jakarta.annotation.Nullable
    public WorkbookFilterCriteria getCriteria() {
        return this.criteria;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("criteria", (n) -> { this.setCriteria(n.getObjectValue(WorkbookFilterCriteria::createFromDiscriminatorValue)); });
        return deserializerMap;
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
        writer.writeObjectValue("criteria", this.getCriteria());
    }
    /**
     * Sets the criteria property value. The criteria property
     * @param value Value to set for the criteria property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCriteria(@jakarta.annotation.Nullable final WorkbookFilterCriteria value) {
        this.criteria = value;
    }
}
