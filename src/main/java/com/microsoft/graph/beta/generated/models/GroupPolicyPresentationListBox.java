package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents an ADMX listBox element and an ADMX list element.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GroupPolicyPresentationListBox extends GroupPolicyUploadedPresentation implements Parsable {
    /**
     * Instantiates a new {@link GroupPolicyPresentationListBox} and sets the default values.
     */
    public GroupPolicyPresentationListBox() {
        super();
        this.setOdataType("#microsoft.graph.groupPolicyPresentationListBox");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GroupPolicyPresentationListBox}
     */
    @jakarta.annotation.Nonnull
    public static GroupPolicyPresentationListBox createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupPolicyPresentationListBox();
    }
    /**
     * Gets the explicitValue property value. If this option is specified true the user must specify the registry subkey value and the registry subkey name. The list box shows two columns, one for the name and one for the data. The default value is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getExplicitValue() {
        return this.backingStore.get("explicitValue");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("explicitValue", (n) -> { this.setExplicitValue(n.getBooleanValue()); });
        deserializerMap.put("valuePrefix", (n) -> { this.setValuePrefix(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the valuePrefix property value. The valuePrefix property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getValuePrefix() {
        return this.backingStore.get("valuePrefix");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("explicitValue", this.getExplicitValue());
        writer.writeStringValue("valuePrefix", this.getValuePrefix());
    }
    /**
     * Sets the explicitValue property value. If this option is specified true the user must specify the registry subkey value and the registry subkey name. The list box shows two columns, one for the name and one for the data. The default value is false.
     * @param value Value to set for the explicitValue property.
     */
    public void setExplicitValue(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("explicitValue", value);
    }
    /**
     * Sets the valuePrefix property value. The valuePrefix property
     * @param value Value to set for the valuePrefix property.
     */
    public void setValuePrefix(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("valuePrefix", value);
    }
}
