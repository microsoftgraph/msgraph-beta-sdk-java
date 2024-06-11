package com.microsoft.graph.beta.models.industrydata;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IndustryDataConnector extends Entity implements Parsable {
    /**
     * Instantiates a new {@link IndustryDataConnector} and sets the default values.
     */
    public IndustryDataConnector() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IndustryDataConnector}
     */
    @jakarta.annotation.Nonnull
    public static IndustryDataConnector createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.industryData.apiDataConnector": return new ApiDataConnector();
                case "#microsoft.graph.industryData.azureDataLakeConnector": return new AzureDataLakeConnector();
                case "#microsoft.graph.industryData.fileDataConnector": return new FileDataConnector();
                case "#microsoft.graph.industryData.oneRosterApiDataConnector": return new OneRosterApiDataConnector();
            }
        }
        return new IndustryDataConnector();
    }
    /**
     * Gets the displayName property value. The name of the data connector. Maximum supported length is 100 characters.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("sourceSystem", (n) -> { this.setSourceSystem(n.getObjectValue(SourceSystemDefinition::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the sourceSystem property value. The sourceSystem property
     * @return a {@link SourceSystemDefinition}
     */
    @jakarta.annotation.Nullable
    public SourceSystemDefinition getSourceSystem() {
        return this.backingStore.get("sourceSystem");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("sourceSystem", this.getSourceSystem());
    }
    /**
     * Sets the displayName property value. The name of the data connector. Maximum supported length is 100 characters.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the sourceSystem property value. The sourceSystem property
     * @param value Value to set for the sourceSystem property.
     */
    public void setSourceSystem(@jakarta.annotation.Nullable final SourceSystemDefinition value) {
        this.backingStore.set("sourceSystem", value);
    }
}
