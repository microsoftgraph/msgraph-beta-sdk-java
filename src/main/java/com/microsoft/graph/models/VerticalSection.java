package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class VerticalSection extends Entity implements Parsable {
    /**
     * Enumeration value that indicates the emphasis of the section background. The possible values are: none, netural, soft, strong, unknownFutureValue.
     */
    private SectionEmphasisType emphasis;
    /**
     * The set of web parts in this section.
     */
    private java.util.List<WebPart> webparts;
    /**
     * Instantiates a new verticalSection and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public VerticalSection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a verticalSection
     */
    @javax.annotation.Nonnull
    public static VerticalSection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VerticalSection();
    }
    /**
     * Gets the emphasis property value. Enumeration value that indicates the emphasis of the section background. The possible values are: none, netural, soft, strong, unknownFutureValue.
     * @return a sectionEmphasisType
     */
    @javax.annotation.Nullable
    public SectionEmphasisType getEmphasis() {
        return this.emphasis;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("emphasis", (n) -> { this.setEmphasis(n.getEnumValue(SectionEmphasisType.class)); });
        deserializerMap.put("webparts", (n) -> { this.setWebparts(n.getCollectionOfObjectValues(WebPart::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the webparts property value. The set of web parts in this section.
     * @return a webPart
     */
    @javax.annotation.Nullable
    public java.util.List<WebPart> getWebparts() {
        return this.webparts;
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
        writer.writeEnumValue("emphasis", this.getEmphasis());
        writer.writeCollectionOfObjectValues("webparts", this.getWebparts());
    }
    /**
     * Sets the emphasis property value. Enumeration value that indicates the emphasis of the section background. The possible values are: none, netural, soft, strong, unknownFutureValue.
     * @param value Value to set for the emphasis property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmphasis(@javax.annotation.Nullable final SectionEmphasisType value) {
        this.emphasis = value;
    }
    /**
     * Sets the webparts property value. The set of web parts in this section.
     * @param value Value to set for the webparts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebparts(@javax.annotation.Nullable final java.util.List<WebPart> value) {
        this.webparts = value;
    }
}
