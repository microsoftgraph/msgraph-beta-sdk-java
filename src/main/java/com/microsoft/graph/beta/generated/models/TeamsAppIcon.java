package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamsAppIcon extends Entity implements Parsable {
    /**
     * Instantiates a new {@link TeamsAppIcon} and sets the default values.
     */
    public TeamsAppIcon() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TeamsAppIcon}
     */
    @jakarta.annotation.Nonnull
    public static TeamsAppIcon createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamsAppIcon();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("hostedContent", (n) -> { this.setHostedContent(n.getObjectValue(TeamworkHostedContent::createFromDiscriminatorValue)); });
        deserializerMap.put("webUrl", (n) -> { this.setWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hostedContent property value. The contents of the app icon if the icon is hosted within the Teams infrastructure.
     * @return a {@link TeamworkHostedContent}
     */
    @jakarta.annotation.Nullable
    public TeamworkHostedContent getHostedContent() {
        return this.backingStore.get("hostedContent");
    }
    /**
     * Gets the webUrl property value. The web URL that can be used for downloading the image.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWebUrl() {
        return this.backingStore.get("webUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("hostedContent", this.getHostedContent());
        writer.writeStringValue("webUrl", this.getWebUrl());
    }
    /**
     * Sets the hostedContent property value. The contents of the app icon if the icon is hosted within the Teams infrastructure.
     * @param value Value to set for the hostedContent property.
     */
    public void setHostedContent(@jakarta.annotation.Nullable final TeamworkHostedContent value) {
        this.backingStore.set("hostedContent", value);
    }
    /**
     * Sets the webUrl property value. The web URL that can be used for downloading the image.
     * @param value Value to set for the webUrl property.
     */
    public void setWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("webUrl", value);
    }
}
