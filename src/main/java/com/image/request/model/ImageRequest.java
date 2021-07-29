package com.image.request.model;

import java.util.List;
import java.util.Scanner;

public class ImageRequest
{
    private _shards _shards;

    private List<Hits> hits;

    private String took;

    private String timed_out;

    public _shards get_shards ()
    {
        return _shards;
    }

    public void set_shards (_shards _shards)
    {
        this._shards = _shards;
    }

    public List<Hits> getHits ()
    {
        return hits;
    }

    public void setHits (List<Hits> hits)
    {
        this.hits = hits;
    }

    public String getTook ()
    {
        return took;
    }

    public void setTook (String took)
    {
        this.took = took;
    }

    public String getTimed_out ()
    {
        return timed_out;
    }

    public void setTimed_out (String timed_out)
    {
        this.timed_out = timed_out;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [_shards = "+_shards+", hits = "+hits+", took = "+took+", timed_out = "+timed_out+"]";
    }
}

//Hits

class Hits
{
    private String _index;

    private String _type;

    private _source _source;

    private String _id;

    private String _score;

    public String get_index ()
    {
        return _index;
    }

    public void set_index (String _index)
    {
        this._index = _index;
    }

    public String get_type ()
    {
        return _type;
    }

    public void set_type (String _type)
    {
        this._type = _type;
    }

    public _source get_source ()
    {
        return _source;
    }

    public void set_source (_source _source)
    {
        this._source = _source;
    }

    public String get_id ()
    {
        return _id;
    }

    public void set_id (String _id)
    {
        this._id = _id;
    }

    public String get_score ()
    {
        return _score;
    }

    public void set_score (String _score)
    {
        this._score = _score;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [_index = "+_index+", _type = "+_type+", _source = "+_source+", _id = "+_id+", _score = "+_score+"]";
    }
}

//_source

class _source
{
    private String src;

    private String isFamilyFriendly;

    private String pageTitle;

    private String[] urlPathElements;

    private String language;

    private String[] hostnameKeywords;

    private String requestDuration;

    private String domain;

    private String safeSearchLevel;

    private String width;

    private String lastIndexed;

    private String pageUrl;

    private String imageSize;

    private String fileType;

    private String height;

    public String getSrc ()
    {
        return src;
    }

    public void setSrc (String src)
    {
        this.src = src;
    }

    public String getIsFamilyFriendly ()
    {
        return isFamilyFriendly;
    }

    public void setIsFamilyFriendly (String isFamilyFriendly)
    {
        this.isFamilyFriendly = isFamilyFriendly;
    }

    public String getPageTitle ()
    {
        return pageTitle;
    }

    public void setPageTitle (String pageTitle)
    {
        this.pageTitle = pageTitle;
    }

    public String[] getUrlPathElements ()
    {
        return urlPathElements;
    }

    public void setUrlPathElements (String[] urlPathElements)
    {
        this.urlPathElements = urlPathElements;
    }

    public String getLanguage ()
    {
        return language;
    }

    public void setLanguage (String language)
    {
        this.language = language;
    }

    public String[] getHostnameKeywords ()
    {
        return hostnameKeywords;
    }

    public void setHostnameKeywords (String[] hostnameKeywords)
    {
        this.hostnameKeywords = hostnameKeywords;
    }

    public String getRequestDuration ()
    {
        return requestDuration;
    }

    public void setRequestDuration (String requestDuration)
    {
        this.requestDuration = requestDuration;
    }

    public String getDomain ()
    {
        return domain;
    }

    public void setDomain (String domain)
    {
        this.domain = domain;
    }

    public String getSafeSearchLevel ()
    {
        return safeSearchLevel;
    }

    public void setSafeSearchLevel (String safeSearchLevel)
    {
        this.safeSearchLevel = safeSearchLevel;
    }

    public String getWidth ()
    {
        return width;
    }

    public void setWidth (String width)
    {
        this.width = width;
    }

    public String getLastIndexed ()
    {
        return lastIndexed;
    }

    public void setLastIndexed (String lastIndexed)
    {
        this.lastIndexed = lastIndexed;
    }

    public String getPageUrl ()
    {
        return pageUrl;
    }

    public void setPageUrl (String pageUrl)
    {
        this.pageUrl = pageUrl;
    }

    public String getImageSize ()
    {
        return imageSize;
    }

    public void setImageSize (String imageSize)
    {
        this.imageSize = imageSize;
    }

    public String getFileType ()
    {
        return fileType;
    }

    public void setFileType (String fileType)
    {
        this.fileType = fileType;
    }

    public String getHeight ()
    {
        return height;
    }

    public void setHeight (String height)
    {
        this.height = height;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [src = "+src+", isFamilyFriendly = "+isFamilyFriendly+", pageTitle = "+pageTitle+", urlPathElements = "+urlPathElements+", language = "+language+", hostnameKeywords = "+hostnameKeywords+", requestDuration = "+requestDuration+", domain = "+domain+", safeSearchLevel = "+safeSearchLevel+", width = "+width+", lastIndexed = "+lastIndexed+", pageUrl = "+pageUrl+", imageSize = "+imageSize+", fileType = "+fileType+", height = "+height+"]";
    }
}

//Total

class Total
{
    private String value;

    private String relation;

    public String getValue ()
    {
        return value;
    }

    public void setValue (String value)
    {
        this.value = value;
    }

    public String getRelation ()
    {
        return relation;
    }

    public void setRelation (String relation)
    {
        this.relation = relation;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [value = "+value+", relation = "+relation+"]";
    }
}

//_shards
class _shards
{
    private String total;

    private String failed;

    private String successful;

    private String skipped;

    public String getTotal ()
    {
        return total;
    }

    public void setTotal (String total)
    {
        this.total = total;
    }

    public String getFailed ()
    {
        return failed;
    }

    public void setFailed (String failed)
    {
        this.failed = failed;
    }

    public String getSuccessful ()
    {
        return successful;
    }

    public void setSuccessful (String successful)
    {
        this.successful = successful;
    }

    public String getSkipped ()
    {
        return skipped;
    }

    public void setSkipped (String skipped)
    {
        this.skipped = skipped;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [total = "+total+", failed = "+failed+", successful = "+successful+", skipped = "+skipped+"]";
    }
}

