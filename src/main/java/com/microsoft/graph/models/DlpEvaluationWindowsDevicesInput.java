package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DlpEvaluationWindowsDevicesInput extends DlpEvaluationInput implements Parsable {
    /**
     * The contentProperties property
     */
    private ContentProperties contentProperties;
    /**
     * The sharedBy property
     */
    private String sharedBy;
    /**
     * Instantiates a new DlpEvaluationWindowsDevicesInput and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DlpEvaluationWindowsDevicesInput() {
        super();
        this.setOdataType("#microsoft.graph.dlpEvaluationWindowsDevicesInput");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DlpEvaluationWindowsDevicesInput
     */
    @javax.annotation.Nonnull
    public static DlpEvaluationWindowsDevicesInput createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DlpEvaluationWindowsDevicesInput();
    }
    /**
     * Gets the contentProperties property value. The contentProperties property
     * @return a contentProperties
     */
    @javax.annotation.Nullable
    public ContentProperties getContentProperties() {
        return this.contentProperties;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("contentProperties", (n) -> { this.setContentProperties(n.getObjectValue(ContentProperties::createFromDiscriminatorValue)); });
        deserializerMap.put("sharedBy", (n) -> { this.setSharedBy(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the sharedBy property value. The sharedBy property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSharedBy() {
        return this.sharedBy;
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
        writer.writeObjectValue("contentProperties", this.getContentProperties());
        writer.writeStringValue("sharedBy", this.getSharedBy());
    }
    /**
     * Sets the contentProperties property value. The contentProperties property
     * @param value Value to set for the contentProperties property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentProperties(@javax.annotation.Nullable final ContentProperties value) {
        this.contentProperties = value;
    }
    /**
     * Sets the sharedBy property value. The sharedBy property
     * @param value Value to set for the sharedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharedBy(@javax.annotation.Nullable final String value) {
        this.sharedBy = value;
    }
}
