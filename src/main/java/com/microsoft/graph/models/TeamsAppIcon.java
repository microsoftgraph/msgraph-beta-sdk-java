package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamsAppIcon extends Entity implements Parsable {
    /**
     * The contents of the app icon if the icon is hosted within the Teams infrastructure.
     */
    private TeamworkHostedContent hostedContent;
    /**
     * The web URL that can be used for downloading the image.
     */
    private String webUrl;
    /**
     * Instantiates a new teamsAppIcon and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamsAppIcon() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamsAppIcon
     */
    @javax.annotation.Nonnull
    public static TeamsAppIcon createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamsAppIcon();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("hostedContent", (n) -> { this.setHostedContent(n.getObjectValue(TeamworkHostedContent::createFromDiscriminatorValue)); });
        deserializerMap.put("webUrl", (n) -> { this.setWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hostedContent property value. The contents of the app icon if the icon is hosted within the Teams infrastructure.
     * @return a teamworkHostedContent
     */
    @javax.annotation.Nullable
    public TeamworkHostedContent getHostedContent() {
        return this.hostedContent;
    }
    /**
     * Gets the webUrl property value. The web URL that can be used for downloading the image.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebUrl() {
        return this.webUrl;
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
        writer.writeObjectValue("hostedContent", this.getHostedContent());
        writer.writeStringValue("webUrl", this.getWebUrl());
    }
    /**
     * Sets the hostedContent property value. The contents of the app icon if the icon is hosted within the Teams infrastructure.
     * @param value Value to set for the hostedContent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHostedContent(@javax.annotation.Nullable final TeamworkHostedContent value) {
        this.hostedContent = value;
    }
    /**
     * Sets the webUrl property value. The web URL that can be used for downloading the image.
     * @param value Value to set for the webUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebUrl(@javax.annotation.Nullable final String value) {
        this.webUrl = value;
    }
}
