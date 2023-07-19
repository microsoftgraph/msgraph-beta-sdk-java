package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EndUserNotificationDetail extends Entity implements Parsable {
    /**
     * The emailContent property
     */
    private String emailContent;
    /**
     * The isDefaultLangauge property
     */
    private Boolean isDefaultLangauge;
    /**
     * The language property
     */
    private String language;
    /**
     * The locale property
     */
    private String locale;
    /**
     * The sentFrom property
     */
    private EmailIdentity sentFrom;
    /**
     * The subject property
     */
    private String subject;
    /**
     * Instantiates a new endUserNotificationDetail and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EndUserNotificationDetail() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a endUserNotificationDetail
     */
    @javax.annotation.Nonnull
    public static EndUserNotificationDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EndUserNotificationDetail();
    }
    /**
     * Gets the emailContent property value. The emailContent property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmailContent() {
        return this.emailContent;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("emailContent", (n) -> { this.setEmailContent(n.getStringValue()); });
        deserializerMap.put("isDefaultLangauge", (n) -> { this.setIsDefaultLangauge(n.getBooleanValue()); });
        deserializerMap.put("language", (n) -> { this.setLanguage(n.getStringValue()); });
        deserializerMap.put("locale", (n) -> { this.setLocale(n.getStringValue()); });
        deserializerMap.put("sentFrom", (n) -> { this.setSentFrom(n.getObjectValue(EmailIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isDefaultLangauge property value. The isDefaultLangauge property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDefaultLangauge() {
        return this.isDefaultLangauge;
    }
    /**
     * Gets the language property value. The language property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLanguage() {
        return this.language;
    }
    /**
     * Gets the locale property value. The locale property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLocale() {
        return this.locale;
    }
    /**
     * Gets the sentFrom property value. The sentFrom property
     * @return a emailIdentity
     */
    @javax.annotation.Nullable
    public EmailIdentity getSentFrom() {
        return this.sentFrom;
    }
    /**
     * Gets the subject property value. The subject property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubject() {
        return this.subject;
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
        writer.writeStringValue("emailContent", this.getEmailContent());
        writer.writeBooleanValue("isDefaultLangauge", this.getIsDefaultLangauge());
        writer.writeStringValue("language", this.getLanguage());
        writer.writeStringValue("locale", this.getLocale());
        writer.writeObjectValue("sentFrom", this.getSentFrom());
        writer.writeStringValue("subject", this.getSubject());
    }
    /**
     * Sets the emailContent property value. The emailContent property
     * @param value Value to set for the emailContent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmailContent(@javax.annotation.Nullable final String value) {
        this.emailContent = value;
    }
    /**
     * Sets the isDefaultLangauge property value. The isDefaultLangauge property
     * @param value Value to set for the isDefaultLangauge property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsDefaultLangauge(@javax.annotation.Nullable final Boolean value) {
        this.isDefaultLangauge = value;
    }
    /**
     * Sets the language property value. The language property
     * @param value Value to set for the language property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLanguage(@javax.annotation.Nullable final String value) {
        this.language = value;
    }
    /**
     * Sets the locale property value. The locale property
     * @param value Value to set for the locale property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocale(@javax.annotation.Nullable final String value) {
        this.locale = value;
    }
    /**
     * Sets the sentFrom property value. The sentFrom property
     * @param value Value to set for the sentFrom property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSentFrom(@javax.annotation.Nullable final EmailIdentity value) {
        this.sentFrom = value;
    }
    /**
     * Sets the subject property value. The subject property
     * @param value Value to set for the subject property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubject(@javax.annotation.Nullable final String value) {
        this.subject = value;
    }
}
