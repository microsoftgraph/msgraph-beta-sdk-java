package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FileContentThreatSubmission extends FileThreatSubmission implements Parsable {
    /**
     * Instantiates a new FileContentThreatSubmission and sets the default values.
     */
    public FileContentThreatSubmission() {
        super();
        this.setOdataType("#microsoft.graph.security.fileContentThreatSubmission");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a FileContentThreatSubmission
     */
    @jakarta.annotation.Nonnull
    public static FileContentThreatSubmission createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FileContentThreatSubmission();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("fileContent", (n) -> { this.setFileContent(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileContent property value. It specifies the file content in base 64 format.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFileContent() {
        return this.BackingStore.get("fileContent");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("fileContent", this.getFileContent());
    }
    /**
     * Sets the fileContent property value. It specifies the file content in base 64 format.
     * @param value Value to set for the fileContent property.
     */
    public void setFileContent(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("fileContent", value);
    }
}
