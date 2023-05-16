package com.microsoft.graph.models.industrydata;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IndustryDataConnector extends Entity implements Parsable {
    /** The name of the data connector. Maximum supported length is 100 characters. */
    private String displayName;
    /** The sourceSystem property */
    private SourceSystemDefinition sourceSystem;
    /**
     * Instantiates a new industryDataConnector and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IndustryDataConnector() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a industryDataConnector
     */
    @javax.annotation.Nonnull
    public static IndustryDataConnector createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.industryData.azureDataLakeConnector": return new AzureDataLakeConnector();
                case "#microsoft.graph.industryData.fileDataConnector": return new FileDataConnector();
            }
        }
        return new IndustryDataConnector();
    }
    /**
     * Gets the displayName property value. The name of the data connector. Maximum supported length is 100 characters.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("sourceSystem", (n) -> { this.setSourceSystem(n.getObjectValue(SourceSystemDefinition::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the sourceSystem property value. The sourceSystem property
     * @return a sourceSystemDefinition
     */
    @javax.annotation.Nullable
    public SourceSystemDefinition getSourceSystem() {
        return this.sourceSystem;
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
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("sourceSystem", this.getSourceSystem());
    }
    /**
     * Sets the displayName property value. The name of the data connector. Maximum supported length is 100 characters.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the sourceSystem property value. The sourceSystem property
     * @param value Value to set for the sourceSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSourceSystem(@javax.annotation.Nullable final SourceSystemDefinition value) {
        this.sourceSystem = value;
    }
}
