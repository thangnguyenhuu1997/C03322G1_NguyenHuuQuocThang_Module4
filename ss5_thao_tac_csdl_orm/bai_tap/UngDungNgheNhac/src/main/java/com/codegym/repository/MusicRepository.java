package com.codegym.repository;

import com.codegym.model.Music;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class MusicRepository implements IMusicRepository {
    Session session = null;
    List<Music> musicList = null;
    @Override
    public List<Music> selectAllMusic() {
        try {
            session = ConnectionUtil.sessionFactory.openSession();
            musicList = session.createQuery("from Music ").getResultList();
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return musicList;
    }

    @Override
    public Music selectMusic(int id) {
        for (Music item : musicList) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    @Override
    public void insertMusic(Music music) {
        Transaction transaction = null;
        try {
            session = ConnectionUtil.sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(music);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }

    }

    @Override
    public void update(int id, Music music) {
        Transaction transaction = null;
        try {
            session = ConnectionUtil.sessionFactory.openSession();
            musicList = session.createQuery("from Music ").getResultList();
            transaction = session.beginTransaction();

            for (Music item : musicList) {
                if (item.getId() == id) {
                    item.setName(music.getName());
                    item.setSinger(music.getSinger());
                    item.setKindOfMusic(music.getKindOfMusic());
                    item.setLink(music.getLink());
                }
            }

            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public void remove(int id) {
        Transaction transaction = null;
        try {
            session = ConnectionUtil.sessionFactory.openSession();
            musicList = session.createQuery("from Music ").getResultList();
            transaction = session.beginTransaction();

            for (Music item : musicList) {
                if (item.getId() == id) {
                    session.remove(item);
                }
            }

            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }


}
