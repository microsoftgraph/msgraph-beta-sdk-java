package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationMediaResource extends EducationResource implements Parsable {
    /**
     * Instantiates a new {@link EducationMediaResource} and sets the default values.
     */
    public EducationMediaResource() {
        super();
        this.setOdataType("#microsoft.graph.educationMediaResource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EducationMediaResource}
     */
    @jakarta.annotation.Nonnull
    public static EducationMediaResource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationMediaResource();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("fileUrl", (n) -> { this.setFileUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileUrl property value. Location of the file on shared point folder. Required
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileUrl() {
        return this.backingStore.get("fileUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("fileUrl", this.getFileUrl());
    }
    /**
     * Sets the fileUrl property value. Location of the file on shared point folder. Required
     * @param value Value to set for the fileUrl property.
     */
    public void setFileUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fileUrl", value);
    }
}
